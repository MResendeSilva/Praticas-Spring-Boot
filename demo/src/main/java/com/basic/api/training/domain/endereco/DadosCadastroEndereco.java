package com.basic.api.training.domain.endereco;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

public record DadosCadastroEndereco(
        @NotNull
        String logradouro,
        @NotNull
        Integer numero,
        @NotNull
        String bairro,
        @Null
        String complemento,
        @NotNull
        String cidade,
        @NotNull
        String estado
) {
}
