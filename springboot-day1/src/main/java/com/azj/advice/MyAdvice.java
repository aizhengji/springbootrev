package com.azj.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAdvice {
    @Pointcut(value = "execution(* com.azj.service.*.*(..))")
    public void pointCut(){
    }
    @Before(value = "pointCut()")
    public void bb(JoinPoint joinPoint){
        //额外功能
        log.info("========================={}");
        //原始方法对象
        Signature signature = joinPoint.getSignature();
        //方法名
        String name = signature.getName();
        //参数列表
        Object[] args = joinPoint.getArgs();
        //原始方法所在类的对象
        Object target = joinPoint.getTarget();
        //代理对象
        Object aThis = joinPoint.getThis();
    }
}
