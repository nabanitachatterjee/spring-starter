package com.sample.nabanita.shoppinglist.services;

import com.sample.nabanita.shoppinglist.model.ProductInfo;
import com.sample.nabanita.shoppinglist.repositories.ProductRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class ProductServicesTest {

    private ProductRepository repository;
    private ProductServices services;

    @Before
    public void setup() {
        repository = Mockito.mock(ProductRepository.class);
        services = new ProductServices(repository);
    }

    @Test
    public void CheckIfMethodCanSaveDomain() {
        ProductInfo info = new ProductInfo();
        info.setOwner("nabanita");
        when(repository.save(info)).thenReturn(info);
        Assert.assertEquals("nabanita", services.addProduct(info).getOwner());

    }

    @Test
    public void CheckIfMethodCanReturnAllProducts() {
        ProductInfo info = new ProductInfo();
        info.setOwner("nabanita");
        List<ProductInfo> products = new ArrayList<ProductInfo>();
        products.add(info);
        when(repository.findAllByOwner("nabanita")).thenReturn(products);
        Assert.assertEquals(1, services.getAllProductInfo("nabanita").size());
    }
}
