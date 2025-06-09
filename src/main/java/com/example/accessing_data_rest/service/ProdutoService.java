package com.example.accessing_data_rest.service;

import com.example.accessing_data_rest.model.Produtos;
import com.example.accessing_data_rest.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutosRepository repository;

    public List<Produtos> salvarVariosProdutos(List<Produtos> produtos) {
        // Aqui poderia ter regras de negócio, como validar se um produto já existe, etc.
        return (List<Produtos>) repository.saveAll(produtos);
    }

    public Produtos salvarProduto(Produtos produto){
        return (Produtos) repository.save(produto);
    }

    public List<Produtos> getProdutos(){
        return (List<Produtos>) repository.findAll();
    }
}