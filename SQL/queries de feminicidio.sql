-- Ocorr�ncias em cada munic�pio
select MUNICIPIO_CIRCUNSCRICAO 'Munic�pio', COUNT(*) 'Ocorr�ncias' from TabelaGrande
group by MUNICIPIO_CIRCUNSCRICAO
order by COUNT(*) desc;

-- Ocorr�ncias por cor de pele
select COR_PELE 'Cor da Pele', COUNT(*) 'Ocorr�ncias' from TabelaGrande
group by COR_PELE

-- Ocorr�ncias por ano
select ano_estatistica, COUNT(*) from TabelaGrande
group by ANO_ESTATISTICA
order by COUNT(*) desc;

-- Local das ocorr�ncias
select DESC_TIPOLOCAL, COUNT(*) from TabelaGrande
group by DESC_TIPOLOCAL
order by COUNT(*) desc;

-- Ocorr�ncias por range de idade
select t.range as [Range de Idades], count(*) as [N�mero de Ocorr�ncias]
from (
  select case  
    when IDADE_PESSOA between 0 and 7 then '0 a 7 anos'
    when IDADE_PESSOA between 8 and 18 then '8 a 18 anos'
	when IDADE_PESSOA between 19 and 26 then '19 a 26 anos'
	when IDADE_PESSOA between 27 and 35 then '27 a 35 anos'
	when IDADE_PESSOA between 36 and 45 then '36 a 45 anos'
    else 'Acima de 45 anos' end as range
  from TabelaGrande) t
group by t.range
order by COUNT(*) DESC;

-- Ocorr�ncias por Tipo do local por Munic�pio
Select MUNICIPIO_ELABORACAO, DESC_TIPOLOCAL, COUNT(Desc_tipolocal) from TabelaGrande
group by MUNICIPIO_ELABORACAO, DESC_TIPOLOCAL
Order by MUNICIPIO_ELABORACAO

--Ocorr�ncias por Hor�rio
select t.range as [Range de Horario], count(*) as [Ocorr�ncias]
from (
  select case  
    when HORA_FATO LIKE '6%AM' OR HORA_FATO LIKE '7%AM' OR
	HORA_FATO LIKE '8%AM' OR HORA_FATO LIKE '9%AM' OR 
	HORA_FATO LIKE '9%AM' OR HORA_FATO LIKE '11%AM' OR HORA_FATO LIKE '12%PM' OR HORA_FATO LIKE 'PELA MANH�'
	then 'De manh�'
    when HORA_FATO LIKE '1%PM' OR HORA_FATO LIKE '2%PM' OR
	HORA_FATO LIKE '3%PM' OR HORA_FATO LIKE '4%PM' OR 
	HORA_FATO LIKE '5%PM' OR HORA_FATO LIKE '6%PM' OR HORA_FATO LIKE 'A TARDE' then 'De tarde'
	when HORA_FATO LIKE '7%PM' OR HORA_FATO LIKE '8%PM' OR
	HORA_FATO LIKE '9%PM' OR HORA_FATO LIKE '10%PM' OR 
	HORA_FATO LIKE '11%PM' OR HORA_FATO LIKE '12%PM' OR HORA_FATO LIKE 'A NOITE' then 'De noite'
	when HORA_FATO LIKE '1%AM' OR HORA_FATO LIKE '2%AM' OR
	HORA_FATO LIKE '3%AM' OR HORA_FATO LIKE '4%AM' OR 
	HORA_FATO LIKE '5%AM' OR HORA_FATO LIKE 'DE MADRUGADA' then 'De madrugada'
	when HORA_FATO lIKE 'em hora incerta' then 'Hora incerta'
    else 'QUE?' end as range
  from TabelaGrande) t
group by t.range

--Ocorr�ncias de pessoas trans

select * from tabelagrande
where SEXO_PESSOA != 'feminino'

--Ocorr�ncias por profiss�o

select PROFISSAO 'Profiss�o', COUNT(*) 'Ocorr�ncias' from TabelaGrande
where profissao is not null
group by PROFISSAO

--Ocorr�ncias por m�s

select mes_estatistica 'M�s', COUNT(*) 'Ocorr�ncias' from TabelaGrande
group by MES_ESTATISTICA
order by COUNT(*) desc



