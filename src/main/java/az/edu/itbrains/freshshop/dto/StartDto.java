package az.edu.itbrains.freshshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StartDto {

    private Long id;
    private String name;
    private String imageUrl;
}
