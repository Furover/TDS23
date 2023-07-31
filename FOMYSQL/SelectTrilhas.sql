select  t.IdTrilha , nomeTrilha, t.Descricao, ur.IdUsuRece  from ReceitaTrilha rt
inner join Trilhas t on t.IdTrilha = rt.IdTrilha 
inner join Receitas r  on r.IdReceita  = rt.IdReceita
INNER JOIN UsuarioReceita ur ON ur.IdTrilha = r.IdReceita
INNER JOIN Usuario u ON u.IdUsuario = ur.IdUsuario 