package com.example.e_commerce.service;

import com.example.e_commerce.model.Produto;
import com.example.e_commerce.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author rebeca
 */
@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto adicionarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}
