-- Ocorrências em cada município
select MUNICIPIO_CIRCUNSCRICAO 'Município', COUNT(*) 'Ocorrências' from TabelaGrande
group by MUNICIPIO_CIRCUNSCRICAO
order by COUNT(*) desc;

-- Ocorrências por cor de pele
select COR_PELE 'Cor da Pele', COUNT(*) 'Ocorrências' from TabelaGrande
group by COR_PELE