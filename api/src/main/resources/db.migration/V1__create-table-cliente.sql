
create table cliente (
id_cliente Bigint primary key not null,
nome varchar (50),
cpf varchar (14),
dt_nascimento date,
idade int,
email varchar(60)
);