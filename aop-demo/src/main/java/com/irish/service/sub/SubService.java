package com.irish.service.sub;

import org.springframework.stereotype.Component;

import com.irish.service.ProductService;


@Component
public class SubService extends ProductService{

    public void demo(){
        System.out.println("execute sub service method");
    }
}
