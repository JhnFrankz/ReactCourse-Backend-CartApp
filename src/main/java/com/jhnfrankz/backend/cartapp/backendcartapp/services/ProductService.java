package com.jhnfrankz.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.jhnfrankz.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
