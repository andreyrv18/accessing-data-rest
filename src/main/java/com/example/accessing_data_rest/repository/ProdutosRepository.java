package com.example.accessing_data_rest.repository;

import com.example.accessing_data_rest.projection.ProdutoProjection;
import com.example.accessing_data_rest.model.Produtos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(
        collectionResourceRel = "produtos",
        path="produtos",
        excerptProjection = ProdutoProjection.class
)
public interface ProdutosRepository extends PagingAndSortingRepository<Produtos, Long>, CrudRepository<Produtos, Long> {
    List<Produtos> findByNome(String nome);

    List<Produtos> findByDescricao(String descricao);

}
