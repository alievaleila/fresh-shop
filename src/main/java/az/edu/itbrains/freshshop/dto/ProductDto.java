package az.edu.itbrains.freshshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private Long id;
    private String imageUrl;
    private String name;
    private Boolean sale;
    private Double price;
    private CategoryDto category;
    private LocalDateTime createdAt;
}
