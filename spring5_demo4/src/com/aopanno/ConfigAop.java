package com.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com"})
@EnableAspectJAutoProxy(proxyTargetClass = true)//注解方法配置aspectj
public class ConfigAop {
}
