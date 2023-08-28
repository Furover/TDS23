<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Basic -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>=1, shrink-to-fit=no" />
  
    <title>ChocoLux</title>

    <link rel="stylesheet" type="text/css" href="./css/login.css" />
</head>

<body>
  
  <div class="container_form">

    <h1>Formulário de Cadastro</h1>

    <form class="form" action="ChocolateServlet" method="post">
        
        <div class="form_grupo">
            <label for="nome" class="form_label">Nome</label>
			<input type="text" value="value="<c:out value='${chocolate.nome}' class="form-control" name="name" required="required" placeholder = "Nome chocolate (plastico)"/>"        </div>
        
        <div class="form_grupo">
            <label for="tipo" class="form_label">Tipo</label>
			<input type="text" value="value="<c:out value='${chocolate.tipo}' />" class="form-control" name="tipo" required="required" placeholder = "Tipo">        </div>
        
        <div class="form_grupo">
            <label for="datanascimento" class="form_label">Marca</label>
			<input type="text" value="value="<c:out value='${chocolate.marca}' />" class="form-control" name="name" required="required" placeholder = "marca">        </div> 
			
			<div class="form_grupo">
            <label for="datanascimento" class="form_label">Data de validade</label>
			<input type="text" value="value="<c:out value='${chocolate.data_}' />" class="form-control" name="name" required="required" placeholder = "marca">        </div>               
		
            <div class="submit">

              <input type="hidden" name="acao" value="enviar">
              <button type="submit" name="Submit" class="submit_btn" >Cadastrar</button>
            
            </div>
    </form>

</div>

</body>
</html>