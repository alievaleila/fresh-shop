package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.CategoryDto;
import az.edu.itbrains.freshshop.repository.CategoryRepository;
import az.edu.itbrains.freshshop.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDto> getAllCategories() {
        List<CategoryDto> categoryDtoList = categoryRepository.findAll()
                .stream()
                .map(category -> modelMapper.map(category, CategoryDto.class))
                .collect(Collectors.toList());
        return categoryDtoList;
    }
}
