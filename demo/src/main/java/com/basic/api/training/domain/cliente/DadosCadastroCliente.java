package com.basic.api.training.domain.cliente;

import com.basic.api.training.domain.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Date;

public record DadosCadastroCliente(
        @NotNull
        String nome,
        @NotNull
        @Pattern(regexp = "\\d{11}")
        String cpf,
        @NotNull
        Date dtNascimento,
        @Email
        String email,
        @Pattern(regexp = "\\d{11}")
        String tel,
        @NotNull
        @Valid
        DadosCadastroEndereco endereco
) {
}
