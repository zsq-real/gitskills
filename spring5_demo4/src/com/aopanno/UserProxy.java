package com.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
//注解方式创建对象
@Component
@Aspect//生成代理对象，表示增强类
@Order(2)//多个增强类对同一个类进行增强的时候，设置顺序，值越小，优先级越高
public class UserProxy {
    //抽取相同的切入点
//    @Pointcut(value = "execution(* com.aopanno.User.add(..))")
    @Pointcut(value = "execution(* com.aopanno.User.add(..))")
    public void pointdemo(){

    }

    //前置通知的注解，通知==》增加。修改
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before .........");
    }


    //后置通知,返回结果的时候执行，有异常不执行
    @AfterReturning(value = "pointdemo()")
    public void afterReturning(){
        System.out.println("afterreturning.....");
    }


    //最终通知，方法调用之后执行,有无异常都会执行
    @After(value = "pointdemo()")
    public void after(){
        System.out.println("after.......");
    }


    //异常通知，有一场的时候才会执行
    @AfterThrowing(value = "pointdemo()")
    public void afterthrowing(){
        System.out.println("afterthrowing....");
    }


    //环绕通知
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(" before around......");


        //增强方法,
        proceedingJoinPoint.proceed();
        System.out.println(" after around......");
    }
}
