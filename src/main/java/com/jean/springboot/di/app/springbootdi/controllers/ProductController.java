package com.jean.springboot.di.app.springbootdi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jean.springboot.di.app.springbootdi.models.Product;
import com.jean.springboot.di.app.springbootdi.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> list(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id){
        return productService.getProductById(id);
    }

}
