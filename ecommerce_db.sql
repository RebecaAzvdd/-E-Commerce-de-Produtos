CREATE DATABASE ecommerce_db;
USE ecommerce_db;

CREATE TABLE produto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO produto (nome, descricao, preco, quantidade_estoque)
VALUES 
    ('Camiseta Básica', 'Camiseta de algodão, disponível em várias cores.', 29.90, 100),
    ('Notebook Gamer', 'Notebook com 16GB RAM e SSD de 512GB.', 4599.90, 10),
    ('Mouse Wireless', 'Mouse sem fio com sensor óptico.', 79.90, 200);

SELECT * FROM produto;
