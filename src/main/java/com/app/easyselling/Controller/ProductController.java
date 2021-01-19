package com.app.easyselling.Controller;

import com.app.easyselling.Model.ProductModel;
import com.app.easyselling.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/products")
    private List < ProductModel > getAllProduct() {

        return productService.getAllProduct();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create_product")
    private ProductModel createProduct(@RequestBody ProductModel product) {
        return productService.createProduct (product);
    }

    @PutMapping("/update_product")
    private ProductModel updateProduct(@RequestBody ProductModel products) {

        return productService.updateProduct (products);
    }

    @DeleteMapping("/products/{id}")
    private void deleteProduct(@PathVariable("id") int id) {
        productService.delete (id);
    }


}







