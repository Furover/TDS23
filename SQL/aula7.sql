create database Curso

use curso

create table imagens(
	id int identity (1,1) not null,
	nm_arquivo nvarchar(1000) not null,
	vb_imagens varbinary(max) not null
)

select * from imagens

--colocando uma imagem no sql em forma de binário
insert into imagens(nm_arquivo, vb_imagens)
select 'INSERIDO VIA SQL', * FROM OPENROWSET(BULK 'C:\tempdb\javaimg.png', single_blob) imagens