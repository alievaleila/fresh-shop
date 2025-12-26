package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.CategoryDto;
import az.edu.itbrains.freshshop.dto.ProductDto;
import az.edu.itbrains.freshshop.model.Product;
import az.edu.itbrains.freshshop.repository.ProductRepository;
import az.edu.itbrains.freshshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> {
            ProductDto productDto = new ProductDto();
            productDto.setId(product.getId());
            productDto.setName(product.getName());
            productDto.setImageUrl(product.getImageUrl());
            productDto.setSale(product.getSale());
            productDto.setPrice(product.getPrice());

            CategoryDto categoryDto = new CategoryDto();
            categoryDto.setId(product.getCategory().getId());
            categoryDto.setName(product.getCategory().getName());

            productDto.setCategory(categoryDto);

            return productDto;
        }).collect(Collectors.toList()
        );
    }

    @Override
    public List<ProductDto> getAllLatest() {
        Pageable pageable = PageRequest.of(
                0, 3, Sort.by(Sort.Direction.DESC, "createdAt")
        );
        return productRepository.findAll(pageable).getContent()
                .stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }
}
