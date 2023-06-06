use AdventureWorks2012

declare @valor1 int
declare @valor2 int

set @valor1 = 10
set @valor2 = 20

print 'A SOMA É IGUAL A: ' + CAST((@VALOR1 + @VALOR2) AS NVARCHAR(20);

--UM NUMERO NATURAL SERÁ INFORMADO EM UMA VARIÁVEL
--EXIBA NA TELA SE ESSE NUMERO É PAR OU IMPAR

DECLARE @valorUsuario int = 13
DECLARE @resposta int = @valorUsuario % 2

if @resposta != 0 
	print 'impar'
else if @resposta = 0
	print 'par'
else 
	print 'pane no sistema, alguém me desconfigurou!'

--Estrutura de repetição
DECLARE @contador int = 1

while @contador <= 100
	begin
		print 'contador: ' + cast(@contador as nvarchar(20))
		set @contador = @contador + 1
	end

--Faça um programa que escreva uma listagem de números na tela de 1 a 100, porem
--Quando o número for par escreva contador: numero - par
--Quando o número for impar escreva contador: numero - impar

declare @contador2 int = 1

while @contador2 <= 100
	begin
	if (@contador2 % 2) = 0
		print 'Contador: ' + cast(@contador2 as nvarchar(20)) + ' impar'
	else
		print 'Contador: ' + cast(@contador2 as nvarchar(20)) + ' impar'
	set @contador2 = @contador2 + 1
	end

--Desafio do programador
--Lista os números na tela de 1 a 100 mostrando somente os impares, multiplos de 3
--Mostrar o somatório destes números

DECLARE @c4 int = 1
Declare @c5 int = 0

while @c4 <= 100
	begin
		if (@c4 % 3 = 0 and @c4 % 2 != 0)
		print @c4
		set @c4 += 1
		if (@c4 % 3 = 0 and @c4 % 2 != 0)
		set @c5 += @c4
	end

	print 'a somatória deu: ' + cast(@c5 as nvarchar(20))

-- os espaços importam!!!, e += funciona como ele mesmo mais o valor do lado

--Mostre uma listagem na tela de 233 as 496
--Porem entre 300 e 400 os numeros aumentam de 5 em 5, fora disso os numeros aumentam de 3 em 3

Declare @v1 int = 233

while (@v1 <= 496)
	begin
		if (@v1 between 300 and 400)
			begin
				print @v1
				set @v1 += 5
			end
		else
			begin
				print @v1
				set @v1 += 3
			end

	end

--Criar uma tabela chamada campanha que deve possuir:
--Id do Cliente - Id
--Primeiro Nome - Nome
--Email do cliente - Email
--Baseado no join das tabelas person.person e person.emailadress
--Alterar esta tabela criada com select into incluindo um campo varchar(20) chamado situacao

select * into Campanha from (select a.BusinessEntityID Id, a.FirstName Nome, b.EmailAddress from Person.Person a
inner join Person.EmailAddress b on a.BusinessEntityID = b.BusinessEntityID) as sub

select * from Campanha

alter table Campanha
add situacao varchar(20)

declare @contaLinhas int = 1
declare @totalLinhas int

select @totalLinhas = COUNT(*) from Campanha

while @contaLinhas <= @totalLinhas
begin
	update Campanha
	set situacao = 'ENVIADO'
	where Nome like 'E%' and @contaLinhas = Id
	set @contaLinhas += 1
end

select * from Campanha
where situacao is null