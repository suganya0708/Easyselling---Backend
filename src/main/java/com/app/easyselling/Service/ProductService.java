package com.app.easyselling.Service;

import com.app.easyselling.Model.ProductModel;
import com.app.easyselling.repo.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List < ProductModel > getAllProduct() {
        List < ProductModel > product = new ArrayList < ProductModel > ();
        productRepository.findAll ().forEach (products -> product.add (products));
        return product;
    }

    public ProductModel getProductById(int id) {
        return productRepository.findById (id).get ();
    }

    public ProductModel createProduct(ProductModel product) {
        return productRepository.save (product);
    }


    public ProductModel updateProduct(ProductModel products) {
        return productRepository.save (products);
    }

    public void delete(int id) {
        productRepository.deleteById (id);
    }
}

