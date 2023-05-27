-- Ocorr�ncias em cada munic�pio
select MUNICIPIO_CIRCUNSCRICAO 'Munic�pio', COUNT(*) 'Ocorr�ncias' from TabelaGrande
group by MUNICIPIO_CIRCUNSCRICAO
order by COUNT(*) desc;

-- Ocorr�ncias por cor de pele
select COR_PELE 'Cor da Pele', COUNT(*) 'Ocorr�ncias' from TabelaGrande
group by COR_PELE