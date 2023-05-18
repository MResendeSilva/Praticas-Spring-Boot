package com.api.training.spring.boot.api.domain.cliente;

import com.api.training.spring.boot.api.domain.endereco.Endereco;

public record DadosDetalhamentoCliente(Integer idCliente, String nome, String cpf,
                                       String dtNascimento, String email) { //, Endereco endereco

    public DadosDetalhamentoCliente (Cliente cliente) {
        this(cliente.getIdCliente(),cliente.getNome(),cliente.getCpf(),cliente.getDtNascimento(),
                cliente.getEmail()); //cliente.getEndereco()
    }

}
