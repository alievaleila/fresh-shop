package az.edu.itbrains.freshshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {

    private Long id;
    private Long productId;
    private String name;
    private String imageUrl;
    private Double price;
    private Integer quantity;

    public BigDecimal getTotal() {
        return BigDecimal.valueOf(quantity).multiply(BigDecimal.valueOf(price));
    }
}
