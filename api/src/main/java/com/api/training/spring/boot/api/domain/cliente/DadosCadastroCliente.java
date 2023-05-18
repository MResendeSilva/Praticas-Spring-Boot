package com.api.training.spring.boot.api.domain.cliente;

import com.api.training.spring.boot.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record DadosCadastroCliente(

        @NotNull
        String nome,

        @NotNull
        @Pattern(regexp="\\d{11}")
        String cpf,

        @NotNull
        String dtNascimento,

        @NotNull
        @Email
        String email,

        @NotNull
        @Valid
        DadosEndereco endereco


) {
}
