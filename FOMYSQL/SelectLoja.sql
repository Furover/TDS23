SELECT * FROM Loja l 
INNER JOIN UsuarioItem ui ON ui.IdItemLoja = l.IdItemLoja
INNER JOIN Usuario u ON u.IdUsuario = ui.IdUsuario 