package com.ybondarenko.store.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ProductController {

    @GetMapping("/product")
    public String getProduct() {
        return "product";
    }

}
