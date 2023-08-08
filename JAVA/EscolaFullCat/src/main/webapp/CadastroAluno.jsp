<%@ page language="java" contentType="text/html; text/css; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="meusEstilos.css" rel="stylesheet" type="text/css">
<title>Cadastro de Alune</title>
</head>
<body>
<!-- Importância do conteúdo -->
	<main>	
	<h1 class="fonteZero">Cadastro de alune</h1>
				
	<!-- Topo -->
		<header>
			
			<p class="tituloNome">Cadastrar ume alune</p>
		
		
		</header>
	<!-- Fim topo -->
	
	
	<!-- Menu -->
		<nav>
			<h2 class="fonteZero"> Home - Cadastrar Alunes - Buscar Alune</h2>
			<ul>
			 <li><a href="index.jsp" title="Página principal">Home</a></li>
			 <li><a href="CadastroAluno.jsp" title="Cadastrar Alunos">Cadastrar Alunes</a></li>
			 <li><a href="menu.jsp" title="Buscar aluno">Buscar Alune</a></li>
			 
			</ul>
			
		
		</nav>
	<!-- Fim menu -->
<section class="helpMe">
<div class="helpMe" style="background-color: #3D3D3D; border-radius: 15px; padding: 10px;">
<form method="post" action="AlunoServlet">
<label>Nome:</label><input type="text" id="nome" name="nome" value="${aluno.nome}" placeholder="Digite o Nome!"><br/><br/>
<label>Email:</label><input type="text" id="email" name="email" value="${aluno.email}" placeholder="Digite o Email!"><br/><br/>
<label>Telefone:</label><input type="text" id="telefone" name="telefone" value="${aluno.telefone}" placeholder="Digite o Telefone!"><br/><br/>
<label>Data:</label><input type="text" id="dataCadastro" name="dataCadastro" value="${aluno.data}" placeholder="Digite a Data!"><br/><br/>

<select name="acao" required>
<option selected value = "incluir">Incluir</option>
<option selected value = "alterar">Alterar</option>
<option selected value = "excluir">Excluir</option>
</select>
<input type="submit" value="Enviar">
<input type="reset" value="Limpar"><br/>
</form>
</div>
</section>

</body>
</html>