package com.jhnfrankz.backend.cartapp.backendcartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhnfrankz.backend.cartapp.backendcartapp.models.entities.Product;
import com.jhnfrankz.backend.cartapp.backendcartapp.services.ProductService;

// es rest controller porque va a devolver un json y no una vista
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
    
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list() {
        return service.findAll();
    }

}
