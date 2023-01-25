package com.cydeo.lab08rest.service.Implementation;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductDTO> retrieveProductList() {
        return null;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public List<ProductDTO> retrieveProductListByCategoryListAndPrice(List<Long> categoryList, BigDecimal price) {
        return null;
    }

    @Override
    public ProductDTO retrieveByName(String name) {
        return null;
    }

    @Override
    public List<ProductDTO> retrieveTop3Product() {
        return null;
    }

    @Override
    public Integer retriveByPrice(BigDecimal price) {
        return null;
    }

    @Override
    public List<ProductDTO> retrieveProductListByPriceAndQuantity(BigDecimal price, Integer quantity) {
        return null;
    }

    @Override
    public List<ProductDTO> retrieveByCategory(Long categoryId) {
        return null;
    }
}
