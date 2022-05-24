package com.example.SpringBootAop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){
        //logging
        //Authentication & Authorization
        //Sanitize the data
        System.out.println("Checkout method from ShoppingCart");
    }

    public int returnNum(){
        System.out.println("Number is returned");
        return 20;
    }
}
