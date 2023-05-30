Use AdventureWorks2016

select * from Person.Person

select FirstName, UPPER(FirstName), LastName, LOWER(LastName) from Person.Person

--length - LEN

Select FirstName, LEN(FirstName) from Person.Person

Select FirstName, SUBSTRING(FirstName,2,1) from Person.Person
Where SUBSTRING(FirstName,2,1) = '.' or SUBSTRING(FirstName,2,1) = ',';

Select REPLACE(FirstName,FirstName, 'João') from Person.Person

Select REPLACE(ProductNumber,'-', '-2023-'), ProductNumber from Production.Product

Select FirstName,MiddleName,LastName from Person.Person

Create or Alter view NOMES as 
Select FirstName,MiddleName,LastName from Person.Person
Where title = 'Ms.'

Select * from NOMES
order by 3 DESC;

Create view EmailAdressNOMES as
Select FirstName, EmailAddress from Person.Person a
inner join Person.EmailAddress b on a.BusinessEntityID = b.BusinessEntityID


