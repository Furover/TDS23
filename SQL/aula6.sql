select * from tblTESTE

alter table tblTESTE
add IDTESTE int primary key identity


update tblTESTE
set firstname = 'Maria'

delete from tblTESTE
where ID = 1

create table laelle(
	id int primary key identity,
	nome varchar(100) not null,
	dataIN datetime default getdate()
	)

select * from laelle

insert into laelle(nome)
values('Sena'),
('Giovanna'),
('Moises')