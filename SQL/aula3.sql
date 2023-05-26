select * from TabelaA as a
full outer join TabelaB as b on a.nome = b.nome

select * from TabelaA as a
left join TabelaB as b on a.nome = b.nome
where b.nome is NULL

select * from TabelaA as a
right join TabelaB as b on a.nome = b.nome
where a.nome is NULL

use AdventureWorks2012
select * from Person.Person
where FirstName like '%Lee%'

select * from Production.Product
where Name like '%Chai%'
UNION
select * from Production.Product
where Name like '%Decal%'
order by Name Desc;

select a.BusinessEntityID, FirstName, LastName, JobTitle, EmailAddress from Person.Person a
inner join Person.EmailAddress b on a.BusinessEntityID = b.BusinessEntityID
inner join HumanResources.Employee c on a.BusinessEntityID = c.BusinessEntityID
where JobTitle like '%desi%'
order by BusinessEntityID

select ListPrice, a.Name, b.Name as 'SubName' from Production.Product a
inner join Production.ProductSubcategory b on a.ProductSubcategoryID = b.ProductSubcategoryID

select a.BusinessEntityID, firstname, c.Name, c.PhoneNumberTypeID, PhoneNumber  from Person.Person a
inner join Person.PersonPhone b on a.BusinessEntityID = b.businessentityid
inner join Person.PhoneNumberType c on b.PhoneNumberTypeID = c.PhoneNumberTypeID;


select a.BusinessEntityID, firstname, EmailAddress from Person.Person a
inner join Person.EmailAddress b on a.BusinessEntityID = b.BusinessEntityID
inner join Sales.PersonCreditCard c on a.BusinessEntityID = c.BusinessEntityID

select a.BusinessEntityID, firstname, EmailAddress from Person.Person a
inner join Person.EmailAddress b on a.BusinessEntityID = b.BusinessEntityID
left join Sales.PersonCreditCard c on a.BusinessEntityID = c.BusinessEntityID
where CreditCardID is null

select COUNT(a.BusinessEntityID) from Person.Person a
inner join Person.EmailAddress b on a.BusinessEntityID = b.BusinessEntityID
left join Sales.PersonCreditCard c on a.BusinessEntityID = c.BusinessEntityID
where CreditCardID is null

select COUNT(a.BusinessEntityID) from Person.Person a
inner join Person.EmailAddress b on a.BusinessEntityID = b.BusinessEntityID
left join Sales.PersonCreditCard c on a.BusinessEntityID = c.BusinessEntityID
where CreditCardID is not null

select * from Production.Product
where ListPrice > (select AVG(listprice) from Production.Product)

select * from HumanResources.Employee
where JobTitle = 'design engineer'

select * from Person.Person
where BusinessEntityID in (select BusinessEntityID from HumanResources.Employee where JobTitle = 'design engineer')