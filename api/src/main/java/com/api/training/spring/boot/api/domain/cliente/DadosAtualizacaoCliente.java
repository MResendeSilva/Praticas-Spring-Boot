package com.api.training.spring.boot.api.domain.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
        @NotNull
        Integer id,
        String nome,
        String cpf,
        @Email
        String email
) {
}
