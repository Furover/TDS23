SELECT u.foto, nome, nivel, limite, experiencia, i.descricao descricaoInsignia, i.foto fotoInsignia FROM Usuario u 
INNER JOIN LimiteNivel ln2 ON ln2.IdNivel = u.IdNivel 
INNER JOIN UsuarioInsignia ui ON ui.IdUsuario = u.IdUsuario
INNER JOIN Insignias i ON i.IdInsignia = ui.IdInsignia 