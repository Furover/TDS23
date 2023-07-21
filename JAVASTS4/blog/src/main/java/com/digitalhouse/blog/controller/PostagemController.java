package com.digitalhouse.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.blog.model.Postagem;
import com.digitalhouse.blog.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens") //ajuste da página de carregamento
@CrossOrigin("*") // para não ter problemas com as origens, seja react, angular etc.
public class PostagemController {
	@Autowired //como é uma interface deixamo o trabalho da injeção a cargo do proprio spring
	private PostagemRepository repository;
	//Fazendo um mapeamento
	@GetMapping //sempre que vir algo externo atraves da url será tratado aqui
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable Long id ){
		//vamos precisar usar um optional e expressão lambda
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
		.orElse(ResponseEntity.notFound().build());
		//se der tudo certo o objeto encontrado vem no responseEntity.om
		//pode não existi então o orElse informar o not found
	}
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity <List<Postagem>> GetByTitulo(@PathVariable String titulo){
		//atenção no PathVariable, não pode esquece
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	@GetMapping("/texto/{texto}")
	public ResponseEntity<List<Postagem>> getByTexto(@PathVariable String texto) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(texto));
	}
	
	@PostMapping //vamos usar esta annotation para identificar que usaremos o verbo post
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping //annotation especificar para este verbo
	public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	@DeleteMapping("/{id}") //o uso desta annotation é muito próximo da annotation GET
	public void delete(@PathVariable Long id){
		repository.deleteById(id);
	}
	
}
