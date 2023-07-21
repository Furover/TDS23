package com.digitalhouse.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalhouse.blog.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	//consulta pelo titulo
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
