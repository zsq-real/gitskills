package com.aopanno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)//先执行的最后结束。，所以after，会呈现在最后
public class PersonProxy {
    @Before(value = "execution(* com.aopanno.User.add())")
    public void after(){
        System.out.println("person before  ........");
    }
}
