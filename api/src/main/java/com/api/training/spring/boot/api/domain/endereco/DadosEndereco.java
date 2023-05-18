package com.api.training.spring.boot.api.domain.endereco;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotNull
        @Pattern(regexp="\\d{8}")
        String cep,

        @NotNull
        Integer numero,
        @NotNull
        String complemento

) {
}
