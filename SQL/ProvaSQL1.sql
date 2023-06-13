--Criando nova database
CREATE DATABASE NaturebaDB
USE NaturebaDB

--Criando tabela de CLIENTE
CREATE TABLE CLIENTE
(
    IdUsuario INT PRIMARY KEY NOT NULL,
    Nome NVARCHAR(100) NOT NULL,
	Cpf NVARCHAR (15) NOT NULL,
	Email NVARCHAR(100) NOT NULL,
	Senha NVARCHAR(100) NOT NULL,
	DataDeCadastro DATETIME DEFAULT GETDATE() NOT NULL
);

--Inserindo dados na tabela
INSERT INTO CLIENTE VALUES (1,'Frederico Brasil de Pereira','11111111109','frederico.brasil@gmail.com','fredericoSENHA',GETDATE())
INSERT INTO CLIENTE VALUES (6,'Trevor Martins dos Santos','11111111209','trevor.martins@gmail.com','SeNhAdOtReVoR',GETDATE())
INSERT INTO CLIENTE VALUES (7,'Maria Guilherme Pinto','11111111309','maria.guilherme@gmail.com','senhamariaGUILHERME',GETDATE())
INSERT INTO CLIENTE VALUES (4,'Mateus Nezzi Ribeiro','11111111409','mateus.nezzi@gmail.com','MaTeUsNEZIZIsenha',GETDATE())
INSERT INTO CLIENTE VALUES (2,'Henrique Machado Jaguira','11111111509','henrique.machado@gmail.com','SENHAdoMACHADO',GETDATE())

--Criando tabela de produtos naturais
CREATE TABLE LOJA_NATUREBA
(
    IdProduto INT PRIMARY KEY NOT NULL,
	Nome NVARCHAR(100) NOT NULL,
    Valor MONEY NOT NULL,
	Descricao TEXT,
	DataDeCadastro DATETIME DEFAULT GETDATE() NOT NULL
);

--Inserindo produtos na tabela
INSERT INTO LOJA_NATUREBA VALUES (5,'Pasta de Dente Vegana','5','Pasta de dente vegana natural, feita de carvão ativado, feito de forma consciente',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (4,'Esponja Natural','7','Esponja natural, durável e biodegradável',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (9,'Creme para Pele','12','Creme para o corpo todo, vegano e feito de forma consciente',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (10,'Escova de Dente','10','Escova de dente, feita de produtos naturais e biodegradáveis',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (6,'Shampoo Natural','15','Shampoo vegano, hidrata o cabelo e não foi testado em animais',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (8,'Condicionador Natural','20','Condicionador vegano, hidrata o cabelo e não foi testado em animais',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (3,'Desodorante Natural','10','Desodorante de rolo, não poluí o meio ambiente e é antitranspirante',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (1,'Fio Dental','7','Fio dental feito de forma consciente',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (7,'Spray de Cabelo','12','Spray para cabelo natural, vegano e hidratante',GETDATE())
INSERT INTO LOJA_NATUREBA VALUES (2,'Hidratante Labial','10','Hidratante labial, feito de maneira consciente e com cheiro de coco',GETDATE())

--Criando tabela de MOVIMENTO
CREATE TABLE MOVIMENTO 
(
    IdMov INT NOT NULL,
	IdProduto int NOT NULL,
    IdUsuario int NOT NULL,
	Quantidade int NOT NULL,
);

--Inserindo dados na tabela
INSERT INTO MOVIMENTO VALUES ('1',	'4',	'6',	'4')
INSERT INTO MOVIMENTO VALUES ('1',	'5',	'6',	'3')
INSERT INTO MOVIMENTO VALUES ('1',	'9',	'6',	'4')
INSERT INTO MOVIMENTO VALUES ('2',	'10',	'1',	'3')
INSERT INTO MOVIMENTO VALUES ('3',	'10',	'7',	'3')
INSERT INTO MOVIMENTO VALUES ('3',	'6',	'7',	'11')
INSERT INTO MOVIMENTO VALUES ('3',	'8',	'7',	'4')
INSERT INTO MOVIMENTO VALUES ('3',	'9',	'7',	'5')
INSERT INTO MOVIMENTO VALUES ('3',	'3',	'7',	'3')
INSERT INTO MOVIMENTO VALUES ('4',	'5',	'6',	'10')
INSERT INTO MOVIMENTO VALUES ('4',	'3',	'6',	'2')
INSERT INTO MOVIMENTO VALUES ('5',	'10', '4',	'9')
INSERT INTO MOVIMENTO VALUES ('5',	'9',	'4',	'4')
INSERT INTO MOVIMENTO VALUES ('5',	'8',	'4',	'5')
INSERT INTO MOVIMENTO VALUES ('5',	'7',	'4',	'6')
INSERT INTO MOVIMENTO VALUES ('5',	'6',	'4',	'3')
INSERT INTO MOVIMENTO VALUES ('5',	'5',	'4',	'2')
INSERT INTO MOVIMENTO VALUES ('5',	'4',	'4',	'10')
INSERT INTO MOVIMENTO VALUES ('5',	'3',	'4',	'3')
INSERT INTO MOVIMENTO VALUES ('5',	'2',	'4',	'1')
INSERT INTO MOVIMENTO VALUES ('5',	'1',	'4',	'3')

--Mostrando os dados
select idMov, b.IdProduto, Descricao, Valor, (Valor * Quantidade) SubTotal from MOVIMENTO a
inner join LOJA_NATUREBA b on b.IdProduto = a.IdProduto
inner join CLIENTE c on c.IdUsuario = a.IdUsuario

--Produto mais vendido
select top(1) COUNT(IdProduto) 'QuantidadeDeRepetições', a.IdProduto from MOVIMENTO
group by IdProduto
order by COUNT(idproduto) desc

--Produto mais vendido Quantidade e Presença
select top(1) COUNT(IdProduto) 'QuantidadeDeRepetições', sum(Quantidade) 'QuantidadeDeVendas', (sum(Quantidade) + COUNT(IdProduto)) 'QuantidadeDeVendasERepetições', IdProduto from MOVIMENTO 
group by IdProduto
order by 'QuantidadeDeVendasERepetições' desc

--Média de vendas
create view vendas as
select idMov, b.IdProduto, Descricao, Valor, (Valor * Quantidade) SubTotal from MOVIMENTO a
inner join LOJA_NATUREBA b on b.IdProduto = a.IdProduto
select AVG(subtotal) 'Média' from vendas

--Total venda procedure
create procedure TotalMovimento @IdMov int 
as
select IdMov, SUM((Valor * Quantidade)) ValorTotal from MOVIMENTO a
inner join LOJA_NATUREBA b on b.IdProduto = a.IdProduto
where IdMov = @IdMov
group by IdMov
go

--Desafio bônus
create proc Contador5a9 @num int as

if (@num between 5 and 9)
	begin
		print @num
		while (@num < 100)
			begin
				set @num = @num * 3
				print @num
			end
	end
go

exec Contador5a9 @num = 5