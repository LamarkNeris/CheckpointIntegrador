package com.DH.Checkpoint.Integrador.service;

import com.DH.Checkpoint.Integrador.dao.ProdutoDao;
import com.DH.Checkpoint.Integrador.persistence.model.Categoria;
import com.DH.Checkpoint.Integrador.persistence.model.Produto;
import com.DH.Checkpoint.Integrador.persistence.repository.CategoriaRepository;
import com.DH.Checkpoint.Integrador.persistence.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository repository;

    public  Produto insert(ProdutoDao produtoDao){
        Categoria categoria1 = repository.getById(produtoDao.getCategoriaId());
        Produto produto1 = new Produto();
        produto1.setNome(produtoDao.getNome());
        produto1.setImagem(produtoDao.getImagem());
        produto1.setPreco(produtoDao.getPreco());
        produto1.setCategoria(categoria1);
        produto1.setDescricao(produtoDao.getDescricao());
        return  produtoRepository.save(produto1);
    }
    public List<Produto> selectAll(){

        return produtoRepository.findAll();
    }
    public Produto select(Integer id){
        return  produtoRepository.getById(id);
    }
    public List<Produto> selectCategProdt(Integer id){
        Categoria categoria1 = repository.getById(id);
        return produtoRepository.listarProdutos(categoria1);
    }
}
