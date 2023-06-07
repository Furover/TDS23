create or alter proc returnName @numId int,
								@comName NVARCHAR(2000) output
as
	set @comName = (select (FirstName + ' ' + LastName) FullName from person.person where businessentityId = @numId)
	return
go

Declare @complName nvarchar(2000)
exec returnName @numId = 2280,@comName = @complName output
print @complName