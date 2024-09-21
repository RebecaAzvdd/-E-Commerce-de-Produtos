package com.example.e_commerce.controller;

import com.example.e_commerce.model.Produto;
import com.example.e_commerce.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author rebeca
 */
@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoService.listarProdutos());
        return "produtos";
    }

    @PostMapping("/adicionar")
    public String adicionarProduto(Produto produto) {
        produtoService.adicionarProduto(produto);
        return "redirect:/produtos";
    }
}
