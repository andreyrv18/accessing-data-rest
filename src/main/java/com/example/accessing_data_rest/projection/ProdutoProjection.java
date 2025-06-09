package com.example.accessing_data_rest.projection;

import com.example.accessing_data_rest.model.Produtos;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "withDescricao",
        types = {Produtos.class}
)
public interface ProdutoProjection {
    long getId();

    String getNome();

    String getDescricao();
}