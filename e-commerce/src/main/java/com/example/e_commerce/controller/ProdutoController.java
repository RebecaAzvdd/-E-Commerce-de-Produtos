package com.example.e_commerce.controller;

import com.example.e_commerce.model.Produto;
import com.example.e_commerce.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @PostMapping("/remover/{id}")
public String removerProduto(@PathVariable Long id) {
    produtoService.removerProduto(id);
    return "redirect:/produtos";
}
  @GetMapping("/editar/{id}")
    public String editarProduto(@PathVariable Long id, Model model) {
        Produto produto = produtoService.findById(id); // Busca o produto pelo ID
        model.addAttribute("produto", produto);
        return "editar"; // Nome da página HTML para edição
    }

    // Endpoint para processar o formulário de edição
    @PostMapping("/editar")
    public String salvarEdicaoProduto(@ModelAttribute Produto produto) {
        produtoService.update(produto); // Atualiza o produto no banco de dados
        return "redirect:/produtos"; // Redireciona para a lista de produtos
    }
}
