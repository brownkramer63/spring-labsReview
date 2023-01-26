package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.model.ResponseWrapper;
import com.cydeo.lab08rest.repository.ProductRepository;
import com.cydeo.lab08rest.service.Implementation.ProductServiceImpl;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductService productService;
    private final ProductServiceImpl productServiceImpl;

    public ProductController(ProductRepository productRepository, ProductService productService, ProductServiceImpl productServiceImpl) {
        this.productRepository = productRepository;
        this.productService = productService;
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> listAllProducts(){
        return ResponseEntity.ok(new ResponseWrapper("products successfully retrieved",productServiceImpl.retrieveProductList(), HttpStatus.OK));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateProduct(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(new ResponseWrapper("product updated",productServiceImpl.updateProduct(productDTO),HttpStatus.OK));
    }

}
