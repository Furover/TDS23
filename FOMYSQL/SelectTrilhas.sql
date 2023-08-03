select  t.IdTrilha, r.Nome, nomeTrilha, t.Descricao  from UsuarioReceita ur
inner join Trilhas t on t.IdTrilha = ur.IdTrilha 
inner join Receitas r  on r.IdReceita  = ur.IdReceita
INNER JOIN Usuario u on u.IdUsuario = ur.IdUsuario