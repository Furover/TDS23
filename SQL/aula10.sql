DECLARE @c4 int = 1
Declare @c5 int = 0
declare @c6 int = 100

while @c4 <= @c6
	begin
		if (@c4 % 3 = 0 and @c4 % 2 != 0)
		print @c4
		set @c4 += 1
		if (@c4 % 2 = 0)
		set @c5 += @c4
	end

	print 'a somatória deu: ' + cast(@c5 as nvarchar(20))

use AdventureWorks2012

create or alter procedure findName @letter char(1)
as
	select businessentityid, firstname, lastname from Person.Person
	where FirstName like @letter + '%'
	order by FirstName
go

exec findName @letter = n

alter procedure findEmail @Id int
as
	select firstname 'Name', emailaddress Email from Person.Person a
	inner join Person.EmailAddress b on a.BusinessEntityID = b.BusinessEntityID
	where a.BusinessEntityID = @Id
go

exec findEmail @id = 1