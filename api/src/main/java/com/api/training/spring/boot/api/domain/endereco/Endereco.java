package com.api.training.spring.boot.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Endereco {

    private String cep;
    private Integer numero;
    private String complemento;

    public Endereco(DadosEndereco dados) {
        this(dados.cep(), dados.numero(),dados.complemento());
    }
}
