function validarProduto() {
    let isValid = true;

    // Limpa mensagens de erro
    document.querySelectorAll(".error").forEach(e => e.innerText = "");

    // Valida nome
    const nome = document.getElementById("nome").value;
    if (nome.length < 3) {
        document.getElementById("nomeError").innerText = "O nome deve ter pelo menos 3 caracteres.";
        isValid = false;
    }

    // Valida descrição
    const descricao = document.getElementById("descricao").value;
    if (descricao.length < 5) {
        document.getElementById("descricaoError").innerText = "A descrição deve ter pelo menos 5 caracteres.";
        isValid = false;
    }

    // Valida preço
    const preco = document.getElementById("preco").value;
    if (preco <= 0) {
        document.getElementById("precoError").innerText = "O preço deve ser maior que zero.";
        isValid = false;
    }

    // Valida quantidade
    const quantidade = document.getElementById("quantidadeEstoque").value;
    if (quantidade <= 0) {
        document.getElementById("quantidadeError").innerText = "A quantidade deve ser maior que zero.";
        isValid = false;
    }

    return isValid;
}



