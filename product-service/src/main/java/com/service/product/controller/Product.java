package com.service.product.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class Product {

    @GetMapping
    public HashMap<Integer, String> getProduct(){
        HashMap<Integer, String> prodList = new HashMap<Integer, String>();
        prodList.put(1, "Refrigerator");
        prodList.put(2, "Micro Over");
        prodList.put(3, "Washing Machine");
        return prodList;
    }
}
