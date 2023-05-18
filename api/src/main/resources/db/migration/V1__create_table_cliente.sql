
create table cliente (
id_cliente int primary key not null auto_increment,
nome varchar (50),
cpf varchar (14),
dt_nascimento date,
idade int,
email varchar(60)
);