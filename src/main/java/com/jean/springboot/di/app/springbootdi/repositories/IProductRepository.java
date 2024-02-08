package com.jean.springboot.di.app.springbootdi.repositories;

import java.util.List;

import com.jean.springboot.di.app.springbootdi.models.Product;

public interface IProductRepository {
    List<Product> getProducts();
    Product getProductByid(Long id);

}
