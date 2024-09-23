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
    
    public void removerProduto(Long id) {
    produtoRepository.deleteById(id);
}

     public Produto findById(Long id) {
        return produtoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
    }

    public void update(Produto produto) {
        produtoRepository.save(produto); // Salva o produto atualizado no banco de dados
    }
}
