create table endereco(
id_endereco int primary key not null auto_increment,
cep char (8),
numero int,
complemento varchar(50),
fk_cliente int,
FOREIGN KEY (fk_cliente) REFERENCES cliente (id_cliente)
);