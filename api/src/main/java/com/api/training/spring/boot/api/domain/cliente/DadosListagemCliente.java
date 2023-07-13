package com.api.training.spring.boot.api.domain.cliente;

import com.api.training.spring.boot.api.domain.endereco.Endereco;

public record DadosListagemCliente(Integer id, String nome, String cpf, String email) {
    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getIdCliente(), cliente.getNome(), cliente.getCpf(), cliente.getEmail());
    }
}
