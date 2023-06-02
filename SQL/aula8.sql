Declare @testName 
set @testName = 'Marcos Nunes'
Print 'Name of the classmate that is always present = ' + @testName

declare @variable1 int = 2
declare @variable2 int = 5
declare @variable3 int = @variable1 + @variable2
--print @variable1 + @variable2
--select @variable1 + @variable2

print 'a soma de ' + cast(@variable1 as nvarchar(20)) + ' mais ' + cast(@variable2 as nvarchar(20)) + ' é igual a ' + cast((@variable1 + @variable2) as nvarchar(20))

--Teste
--Colocar nome de um turista americano em uma variável
--Colocar a temperatura em graus celsius em outra variável
--Exibir o nome do turista e a temperatura em grais farenheight pois é o padrão americano

declare @name nvarchar(20)
declare @tempC decimal(7,2)
declare @tempF decimal(7,2)

set @name = 'Robert Hudson'
set @tempC = 32.00
set @tempF = (@tempC * 9 / 5) + 32

print 'Hello ' + @name + ', the temperature is ' + CAST(@tempF as nvarchar(20)) + 'ºF'
print 'Have a good day/night!'

--Teste
--Identificar os dias totais aproximados de uma pessoa baseado na idade que ela tem
--Considerando o ano comercial (365)
--Exemplo, 30 anos
--Cada ano tem 365 dias
--Dias totais dessa pessoa = 30 * 365
--Oi @nome, seus dias aproximados na terra são @dias



declare @days int
declare @age int
declare @name nvarchar(20)

set @name = 'Pedro'
set @age = 19
set @days = @age * 365

print 'Hello ' + @name + ', your total aproximate days alive are ' + cast(@days as nvarchar(20)) + ' days.'

