package com.api.training.spring.boot.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        @Pattern(regexp = "(\\{5})-(\\{3})")
        String cep,

        @NotBlank
        Integer numero,
        @NotBlank
        String complemento

) {
}
