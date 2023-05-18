create table endereco(
id_endereco Bigint primary key not null auto_increment,
cep char (8),
numero int,
complemento varchar(50),
fk_cliente int,
FOREIGN KEY (fk_cliente) REFERENCES fk_cliente (id_cliente)
);