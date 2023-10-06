CREATE DATABASE tienda_epica

CREATE TABLE producto (
  id int(11) NOT PRIMARY KEY AUTO_INCREMENT NULL,
  nombre varchar(55) NOT NULL,
  descripcion varchar(55) NOT NULL,
  precio decimal(18,2) NOT NULL,
  costo decimal(10,2) NOT NULL,
  cantidad decimal(10,2) NOT NULL
);


INSERT INTO producto (id, nombre, descripcion, precio, costo, cantidad) VALUES
(1, 'Café', 'Mocachino', 6000.00, 2000.00, 20.00);


