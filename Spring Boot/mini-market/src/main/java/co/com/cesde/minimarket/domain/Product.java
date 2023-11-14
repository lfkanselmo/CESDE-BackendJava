package co.com.cesde.minimarket.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private Integer productId;
    private String productName;
    private Integer categoryId;
    private Double price;
    private Integer stock;
    private Integer status;
    private Category category;
}
