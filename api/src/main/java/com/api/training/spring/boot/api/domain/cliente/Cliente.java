package com.api.training.spring.boot.api.domain.cliente;

import com.api.training.spring.boot.api.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cliente")
@Entity(name = "Cliente")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of= "idCliente")

public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nome;
    private String cpf;
    private String dtNascimento;
    private Integer idade;
    private String email;

    @Embedded
    Endereco endereco;

    public Cliente(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.dtNascimento = dados.dtNascimento();
        this.idade = dados.idade();
        this.email = dados.email();
        this.endereco = new Endereco(dados.endereco());
    }

}
