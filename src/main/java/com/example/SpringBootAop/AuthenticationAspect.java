package com.example.SpringBootAop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {


    //@Pointcut("within(*.*.*.*)")
    @Pointcut("within(com.example.SpringBootAop.*)")
    public void authenticationPointCut(){

    }


    //@Pointcut("within(*.*.*.*)")
    @Pointcut("within(com.example.SpringBootAop.*)")
    public void authorizationPointCut(){

    }

    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }

}
