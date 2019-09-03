package com.sample.nabanita.shoppinglist.controllers;

import com.sample.nabanita.shoppinglist.model.ProductInfo;
import com.sample.nabanita.shoppinglist.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
    private final ProductServices productServices;

    @Autowired
    public ShoppingCartController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping
    ResponseEntity<List<ProductInfo>> getProducts(@RequestParam(name = "owner") String owner) {
        return new ResponseEntity<List<ProductInfo>>(productServices.getAllProductInfo(owner), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<ProductInfo> postProduct(@RequestBody ProductInfo productInfo) {
        return new ResponseEntity<ProductInfo>(productServices.addProduct(productInfo), HttpStatus.OK);
    }
}
