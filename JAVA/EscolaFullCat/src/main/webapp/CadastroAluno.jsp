<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Aluno</title>
</head>
<body>

<div>
<form method="post" action="AlunoServlet">
<fieldset><legend>Cadastro Aluno</legend></fieldset>
<label>Matricula:</label><input type="text" id="matricula" name="matricula" value="${aluno.matricula}" placeholder="Digite sua Matrícula!"><br/>
<label>Nome:</label><input type="text" id="nome" name="nome" value="${aluno.nome}" placeholder="Digite sua Nome!"><br/>
<label>Email:</label><input type="text" id="email" name="email" value="${aluno.email}" placeholder="Digite sua Email!"><br/>
<label>Telefone:</label><input type="text" id="telefone" name="telefone" value="${aluno.telefone}" placeholder="Digite sua Telefone!"><br/>
<label>Data:</label><input type="text" id="dataCadastro" name="dataCadastro" value="${aluno.data}" placeholder="Digite sua Data!"><br/>

<label>Escolha uma ação</label>

<select name="acao" required>
<option selected value = "incluir">Incluir</option>
<option selected value = "alterar">alterar</option>
<option selected value = "excluir">excluir</option>
<option selected value = "consultar">consultar</option>
</select>
<input type="submit" value="Enviar">
<input type="reset" value="Limpar"><br/>
</form>
</div>

</body>
</html>