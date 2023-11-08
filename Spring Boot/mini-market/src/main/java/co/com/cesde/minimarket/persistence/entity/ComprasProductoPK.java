package co.com.cesde.minimarket.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class ComprasProductoPK implements Serializable {
    @Column(name = "id_compras")
    private Integer idCompras;
    @Column(name = "id_producto")
    private Integer idProducto;
}
