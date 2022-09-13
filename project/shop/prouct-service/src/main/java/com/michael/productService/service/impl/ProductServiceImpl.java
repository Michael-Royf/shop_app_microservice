package com.michael.productService.service.impl;

import com.michael.productService.entity.Product;
import com.michael.productService.payload.request.ProductRequest;
import com.michael.productService.payload.response.ProductResponse;
import com.michael.productService.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductServiceImpl {
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private ProductRepository productRepository;


    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        product = productRepository.save(product);
        log.info("Product with id: {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> mapper.map(product, ProductResponse.class))
                .collect(Collectors.toList());
    }
}
