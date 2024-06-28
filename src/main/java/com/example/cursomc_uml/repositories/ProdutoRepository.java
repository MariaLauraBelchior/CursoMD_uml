package com.example.cursomc_uml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc_uml.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}
