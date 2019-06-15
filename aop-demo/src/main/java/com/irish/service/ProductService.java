package com.irish.service;

import org.springframework.stereotype.Component;


@Component
public class ProductService {

    public String findByTwoArgs(Long id,String name){
        System.out.println("execute find by id and name");
        return "Hello";
    }

}
