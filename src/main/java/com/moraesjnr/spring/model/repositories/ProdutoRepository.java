package com.moraesjnr.spring.model.repositories;

import com.moraesjnr.spring.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {


}
