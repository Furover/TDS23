package com.digitalhouse.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
}
