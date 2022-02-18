package com.product.service.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Product {
    
    @GetMapping
    public HashMap<Integer, String> getProduct(){
      HashMap<Integer, String> prodList = new HashMap<Integer, String>();
      prodList.put(1, "Washing Machine");
      prodList.put(2, "Refrigerator");
      prodList.put(3, "Oven");
      return prodList;
    }
}
