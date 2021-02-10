package com.moraesjnr.spring.model.repositories;

import com.moraesjnr.spring.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {



}
