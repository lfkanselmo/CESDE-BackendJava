package co.com.cesde.minimarket.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {

    private Integer categoryId;
    private String categoryName;
    private Integer status;
    private List<Product> products;
}
