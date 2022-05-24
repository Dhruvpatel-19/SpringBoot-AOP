package com.example.SpringBootAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Before("execution(* com.example.SpringBootAop.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println("Arguments Passed : " +jp.getArgs()[0]);
        System.out.println("Before Loggers");
    }

    @After("execution(* *.*.*.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Loggers");
    }

    @After("execution(* com.example.SpringBootAop.ShoppingCart.returnNum(..))")
    public void afterReturnNum(){
        System.out.println("After returnNum");
    }

   //For all methods in particular class , "within" is used
   /* @Pointcut("within(com.example.SpringBootAop.ShoppingCart)")
    public void afterReturningPointCut(){

    }*/

    //For specific methods , "execution" is used
    @Pointcut("execution(* com.example.SpringBootAop.ShoppingCart.returnNum(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()" , returning = "resVal")
    public void afterReturning(Object resVal){
        System.out.println("Returned Value : "+resVal);
    }

    /* @AfterReturning(pointcut = "execution(* com.example.SpringBootAop.ShoppingCart.returnNum(..))" , returning = "resVal")
    public void afterReturning(Object resVal){
        System.out.println("After returnNum");
        System.out.println("Returned Value : "+resVal);
    }*/


}
