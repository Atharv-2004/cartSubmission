package com.example.cart.Cart.controllers;



import com.example.cart.Cart.dtos.FakeStoreCartDto;
import com.example.cart.Cart.models.product;
import com.example.cart.Cart.services.productService;

import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class productController {
    productService ps;

    public productController(productService ps) {
        this.ps = ps;
    }

    @GetMapping("/carts")
    public FakeStoreCartDto[] getAllCarts(){
        return ps.getAllCarts();
    }

     @GetMapping("/products/{id}")
    public product getProductById(@PathVariable("id") Long id) {

        return ps.getProductById(id);
    }

    
}
