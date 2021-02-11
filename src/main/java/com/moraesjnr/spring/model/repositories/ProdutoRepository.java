package com.moraesjnr.spring.model.repositories;

import com.moraesjnr.spring.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository
        extends PagingAndSortingRepository<Produto, Integer> {

    Iterable<Produto> findByNomeContaining(String parteNome);

    //	findByNomeContaining
//	findByNomeIsContaining
//	findByNomeContains
//
//	findByNomeStartsWith
//	findByNomeEndsWith
//
//	findByNomeNotContaining

    //trabalha com flexibilidade maior em nivel de Query
    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);

}
