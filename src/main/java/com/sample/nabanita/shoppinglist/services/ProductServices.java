package com.sample.nabanita.shoppinglist.services;

import com.sample.nabanita.shoppinglist.model.ProductInfo;
import com.sample.nabanita.shoppinglist.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {
    private final ProductRepository repository;

    @Autowired
    public ProductServices(ProductRepository repository) {
        this.repository = repository;
    }

    public List<ProductInfo> getAllProductInfo(String owner) {
        return this.repository.findAllByOwner(owner);
    }

    public ProductInfo addProduct(ProductInfo productInfo) {
        return this.repository.save(productInfo);
    }
}
