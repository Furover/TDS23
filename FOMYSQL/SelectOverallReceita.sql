SELECT r.IdReceita, u.IdUtensilio, r.Nome, i.Nome, ir.TipoMedida, ir.Quantidade, u.Nome, p.Titulo FROM Receitas r 
INNER JOIN UtensiliosReceitas ur ON ur.IdReceita = r.IdReceita
INNER JOIN IngredienteReceita ir ON ir.IdReceita = r.IdReceita 
INNER JOIN Ingredientes i ON i.IdIngrediente = ir.IdIngrediente 
INNER JOIN Utesilios u ON u.IdUtensilio = ur.IdUtensilio
INNER JOIN PasReceita pr ON r.IdReceita = pr.IdReceita 
INNER JOIN Passos p ON p.IdPasso = pr.IdPasso  