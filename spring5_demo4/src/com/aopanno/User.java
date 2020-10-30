package com.aopanno;

import org.springframework.stereotype.Component;

//被增强的类
//注解方式创建对象
@Component
public class User {
    public void add(){
//        int i =10/0;
        System.out.println("user  add ......");
    }
}
