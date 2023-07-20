CREATE DATABASE loja
GO
USE loja

CREATE TABLE produto(
	id int primary key identity(1,1),
	nome varchar(20) not null,
	valor decimal(5,2) not null,
	estoque int not null
)

insert into produto values('Camisa',100.50,10),('Boné',50.00,10)

select * from produto