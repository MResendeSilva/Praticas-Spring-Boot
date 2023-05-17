package com.api.training.spring.boot.api.domain.cliente;

import com.api.training.spring.boot.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente(

        @NotBlank
        String nome,

        @NotBlank
        @Pattern(regexp = "\\{11}")
        String cpf,

        @NotBlank
        String dtNascimento,

        @NotBlank
        Integer idade,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Valid
        DadosEndereco endereco


) {
}
