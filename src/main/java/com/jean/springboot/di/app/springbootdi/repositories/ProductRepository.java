package com.jean.springboot.di.app.springbootdi.repositories;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jean.springboot.di.app.springbootdi.models.Product;

@Component
public class ProductRepository implements IProductRepository{

    private List<Product> products;

    public ProductRepository() {
        this.products = Arrays.asList(
        new Product(1L, "Memoria Corsair", 33.30),
        new Product(2L, "Audifonos SkullCandy", 100.99),
        new Product(3L, "Pantalla AOC 20 Pulgadas", 79.90),
        new Product(4L, "Play Station 5", 5999.20)
        );
    }

    @Override
    public List<Product> getProducts(){
        return products;
    }

    @Override
    public Product getProductByid(Long id ){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }



}
