create table endereco(
	id_endereco int primary key,
	logradouro varchar(100),
    numero int,
	bairro varchar(100),
	complemento varchar(200) default("nao possui"),
	cidade varchar(100),
    estado varchar(100)
);

create table cliente(
	id_cliente int primary key,
	nome varchar(100),
    cpf char(11),
    dt_nascimento date,
    email varchar(100),
    tel varchar(11),
	fk_endereco int,
    foreign key (fk_endereco) references endereco (id_endereco)
);
