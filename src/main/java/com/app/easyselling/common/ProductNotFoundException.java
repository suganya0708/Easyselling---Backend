package com.app.easyselling.common;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ProductNotFoundException extends RuntimeException{


    public ProductNotFoundException(String message){
        super(message);
    }
}
