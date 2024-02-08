package com.jean.springboot.di.app.springbootdi.services;

import java.util.List;

import com.jean.springboot.di.app.springbootdi.models.Product;

public interface IProductService {

    List<Product> getProducts();
    Product getProductById(Long id);

}
