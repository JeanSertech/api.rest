package com.jean.springboot.di.app.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.jean.springboot.di.app.springbootdi.models.Product;
import com.jean.springboot.di.app.springbootdi.repositories.ProductRepository;

public class ProductService {

    private ProductRepository productRepository =  new ProductRepository();

    public List<Product> getProducts(){
        return productRepository.getProducts().stream().map( p -> {
            Double priceImp = p.getPrice() * 1.25d;
            // p.setPrice(priceImp);
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    public Product getProductById(Long id){
        return productRepository.getProductByid(id);
    }

}
