select  t.IdTrilha , nomeTrilha, t.Descricao  from ReceitaTrilha rt
inner join Trilhas t on t.IdTrilha = rt.IdTrilha 
inner join Receitas r  on r.IdReceita  = rt.IdReceita