--atenção! o professor estava brizado durante a aula

use AdventureWorks2012
-- desafio 1
-- criar uma tabela com o firstname, título e middlename das pessoas, mas o título precisa ser 'mr.'
-- e o middlename tem que começar com a
-- por algum motivo fizemos dois selects e demos union, o que acabou juntando o resultado dos dois

select FirstName, Title, MiddleName from Person.Person
where Title = 'mr.'
and MiddleName is not null
union
select FirstName, Title, MiddleName from Person.Person
where MiddleName = 'a'
and Title is not null
and MiddleName is not null
order by FirstName asc;

-- select 577 + 1319
-- 1896 dos dois selects
-- 936 union
-- ele ignora as repetições durante as uniões!!!!

use NorthWind

-- desafio 2
-- juntar as pessoas que entraram no mesmo ano na mesma tabela (um self join)

select E1.FirstName, E1.HireDate, E2.FirstName, E2.HireDate from Employees E1, Employees E2
where DATEPART(YEAR, E1.HireDate) = DATEPART(YEAR, E2.HireDate) and E1.FirstName !=  E2.FirstName

use AdventureWorks2012

-- desafio 3
-- mostrar a media mensal de valores vendidos
-- tabelas sales.salesorderheader

select DATEPART(month,OrderDate) mes, AVG(TotalDue) 'media de ganho' from Sales.SalesOrderHeader
group by DATEPART(month,OrderDate)
order by 1 desc;

select DATEPART(year,OrderDate) ano, AVG(TotalDue) 'media de ganho' from Sales.SalesOrderHeader
group by DATEPART(year,OrderDate)
order by 1 desc;

-- desafio 4
-- quais são os produtos que estão acima da media de vendas
-- production.product - ID, ListPrice
-- sub select - production.productionsubcategory

select ProductID, ListPrice from Production.Product
where ListPrice > (select AVG(listprice) from Production.Product)-- essa aqui é a minha versão, o professor está ficando maluco

select a.ProductID, a.ListPrice from Production.Product a
join(
select b.ProductSubcategoryID, AVG(b.listprice) from Production.Product b
group by b.ProductSubcategoryID
) on -- eu n sei o que o professor tava pensando com essa aqui, depois de um tempo ele desistiu
-- eu acho que a gente nunca usou esse tipo de join