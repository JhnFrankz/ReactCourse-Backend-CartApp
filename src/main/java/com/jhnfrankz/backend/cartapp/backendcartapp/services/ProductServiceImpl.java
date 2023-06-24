package com.jhnfrankz.backend.cartapp.backendcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhnfrankz.backend.cartapp.backendcartapp.models.entities.Product;
import com.jhnfrankz.backend.cartapp.backendcartapp.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    // esto es para que se inyecte la dependencia, es decir, que se cree una
    // instancia de ProductRepository y se guarde en la variable repository, nos
    // ahorramos el new ProductRepository()
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

}
