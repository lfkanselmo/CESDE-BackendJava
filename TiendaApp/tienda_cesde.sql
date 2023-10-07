CREATE DATABASE tienda_epica;

CREATE TABLE producto (
  id int(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
  nombre varchar(55) NOT NULL,
  descripcion varchar(55) NOT NULL,
  precio decimal(18,2) NOT NULL,
  costo decimal(10,2) NOT NULL,
  cantidad decimal(10,2) NOT NULL
);


INSERT INTO producto (nombre, descripcion, precio, costo, cantidad) VALUES
('Café', 'Mocachino', 6000.00, 2000.00, 20.00);
