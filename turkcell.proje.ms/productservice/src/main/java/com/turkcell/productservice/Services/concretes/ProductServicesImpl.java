package com.turkcell.productservice.Services.concretes;

import com.turkcell.productservice.Services.abstracts.ProductServices;
import com.turkcell.productservice.Services.mappers.ProductMapper;
import com.turkcell.productservice.dtos.requests.AddProductRequest;
import com.turkcell.productservice.entities.Product;
import com.turkcell.productservice.repositories.ProductRepositories;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductServicesImpl implements ProductServices {

    private final ProductRepositories productRepositories;

    public ProductServicesImpl(ProductRepositories productRepositories) {
        this.productRepositories = productRepositories;
    }

    @Override
    public Product createdProducted(@Valid AddProductRequest addProductRequest) {

        Product product = ProductMapper.INSTANCE.productFromRequest(addProductRequest);

       Product productResponse = productRepositories.save(product);
        return productResponse;
    }



    @Override
    public List<Product> getAllProducts() {

       return productRepositories.findAll();


    }

    @Override
    public List<Product> getIdAllProducts(int id) {
        return productRepositories.findAllById(id);
    }

/*
    @Override
    public void add(AddProductRequest request) {


        Product product = ProductMapper.INSTANCE.productFromRequest(request);

        productRepositories.save(product);

    }

*/


}
