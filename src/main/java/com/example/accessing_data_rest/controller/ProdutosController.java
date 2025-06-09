package com.example.accessing_data_rest.controller;

import com.example.accessing_data_rest.model.Produtos;
import com.example.accessing_data_rest.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.accessing_data_rest.service.ProdutoService;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProdutosController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/produtos/lote")
    public ResponseEntity<List<Produtos>> criarVariosProdutos(@RequestBody List<Produtos> produtos) {
        List<Produtos> produtosSalvos = produtoService.salvarVariosProdutos(produtos);
        return new ResponseEntity<>(produtosSalvos, HttpStatus.CREATED);
    }

    @PostMapping("/produtos")
    public ResponseEntity<Produtos> criarProduto(@RequestBody Produtos produto){
        Produtos produtoSalvo = produtoService.salvarProduto(produto);
        return ResponseEntity.status(201).body(produtoSalvo);
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<Produtos>> getProdutos(){
        return ResponseEntity.ok(produtoService.getProdutos());
    }
}