select COUNT(*) as 'Produtos Vermelhos' from Production.Product
where Color = 'Red' and ListPrice between 500 and 1000;

select COUNT(Name) from Production.Product
where Name like '%ROAD%';

select top(10) * from Sales.SalesOrderDetail
order by LineTotal DESC;

select top(10) SUM(linetotal) from Sales.SalesOrderDetail

select AVG(linetotal) from Sales.SalesOrderDetail

SELECT FirstName, COUNT(FIRSTNAME) FROM Person.Person
GROUP BY FirstName;

SELECT SpecialOfferID, SUM(LineTotal) FROM Sales.SalesOrderDetail
GROUP BY SpecialOfferID
ORDER BY SUM(LINETOTAL) DESC;

SELECT ProductID, COUNT(ProductID) FROM Sales.SalesOrderDetail
GROUP BY ProductID
ORDER BY SUM(ProductID) DESC;

SELECT COLOR, AVG(ListPrice) FROM Production.Product
GROUP BY COLOR

SELECT MiddleName, COUNT(MIDDLENAME) FROM Person.Person
GROUP BY MiddleName

select ProductID, AVG(OrderQty) 'Media Vendida' from Sales.SalesOrderDetail
group by ProductID

select distinct Top(10) ProductID, SUM(LineTotal) 'Total Vendido' from Sales.SalesOrderDetail
group by ProductID
order by SUM(LineTotal) desc


select ProductID, COUNT(productid) QTD, AVG(OrderQty) MEDIA from Production.WorkOrder
group by ProductID

select firstname, COUNT(firstname) 'repetições' from Person.Person
where FirstName like '__a%'
group by FirstName
having COUNT(firstname) > 10;

select ProductID, SUM(LineTotal) 'Dinheiro Total Ganho' from Sales.SalesOrderDetail
group by ProductID
having SUM(linetotal) between 162000 and 500000
order by SUM(linetotal) DESC;

Select ProductID, avg(LineTotal) as 'Média de Dinheiro Ganho' from Sales.SalesOrderDetail
group by ProductID
having AVG(LineTotal) < 1000
order by avg(LineTotal) DESC;