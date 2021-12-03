package com.DH.Checkpoint.Integrador.controller;

import com.DH.Checkpoint.Integrador.dao.ProdutoDao;
import com.DH.Checkpoint.Integrador.persistence.model.Produto;
import com.DH.Checkpoint.Integrador.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;


    @PostMapping
    public ResponseEntity<Produto> createProduto(@RequestBody ProdutoDao produtoDao){

        return ResponseEntity.ok(service.insert(produtoDao));
    }
    @GetMapping
    public ResponseEntity<List<Produto>> selectProduto(){

        return ResponseEntity.ok(service.selectAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produto> selectProdutoId(@PathVariable Integer id){

        return ResponseEntity.ok(service.select(id));
    }
    @GetMapping("categoria/produto/{id}")
    public ResponseEntity<List<Produto>> selectProdtCateg(@PathVariable Integer id){

        return ResponseEntity.ok(service.selectCategProdt(id));
    }
}
