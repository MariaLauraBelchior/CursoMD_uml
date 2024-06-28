package com.example.cursomc_uml;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cursomc_uml.domain.Categoria;
import com.example.cursomc_uml.domain.Produto;
import com.example.cursomc_uml.repositories.CategoriaRepository;
import com.example.cursomc_uml.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcUmlApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcUmlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritoria");
	
		Produto pro1 = new Produto(null, "Mouse", 20.00);
		Produto pro2 = new Produto(null, "Cadeira", 250.00);
		Produto pro3 = new Produto(null, "Table", 100.00);

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(pro1, pro2, pro3));
	}

}
