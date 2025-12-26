package az.edu.itbrains.freshshop.service;

import az.edu.itbrains.freshshop.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAllProducts();

    List<ProductDto> getAllLatest();
}
