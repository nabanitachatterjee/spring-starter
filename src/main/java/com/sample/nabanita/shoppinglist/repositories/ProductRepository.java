package com.sample.nabanita.shoppinglist.repositories;

import com.sample.nabanita.shoppinglist.model.ProductInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<ProductInfo, String> {
    /*
        find - all - by owner

        find-all => finds all the documents
        by       => criteria
        owner    => criteria parameter
     */
    List<ProductInfo> findAllByOwner(String owner);
}
