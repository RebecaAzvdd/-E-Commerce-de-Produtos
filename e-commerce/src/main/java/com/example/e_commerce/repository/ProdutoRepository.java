package com.example.e_commerce.repository;

import com.example.e_commerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author rebeca
 */
public  interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
