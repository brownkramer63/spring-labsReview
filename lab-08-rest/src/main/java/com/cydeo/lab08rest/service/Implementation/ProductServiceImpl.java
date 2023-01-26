package com.cydeo.lab08rest.service.Implementation;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.entity.Product;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.ProductRepository;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final MapperUtil mapperUtil;

    public ProductServiceImpl(ProductRepository productRepository, MapperUtil mapperUtil) {
        this.productRepository = productRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<ProductDTO> retrieveProductList() {
        return productRepository.findAll().stream()
                .map(product->mapperUtil.convert(product, new ProductDTO())).collect(Collectors.toList());
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
          Product product = productRepository.save(mapperUtil.convert(productDTO, new Product()));
        return mapperUtil.convert(product, new ProductDTO());
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
