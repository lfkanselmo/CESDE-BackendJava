package co.com.cesde.minimarket.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "clientes")
public class Cliente {
 @Id
 @Column(name = "id_cliente")
 private Integer idCliente;
 @Column(name = "nombre_cliente")
 private String nombreCliente;
 @Column(name = "apellido_cliente")
 private String apellidoCliente;
 private Double celular;
 private String direccion;
 private String email;

 @OneToMany(mappedBy = "cliente")
 private List<Compra> compras;
}
