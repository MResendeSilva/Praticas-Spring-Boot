package com.api.training.spring.boot.api.domain.endereco;

import com.api.training.spring.boot.api.domain.cliente.Cliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Table(name="endereco")
@Entity(name="Endereco")
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of="idEndereco")
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;
    private String cep;
    private Integer numero;
    private String complemento;

    @OneToOne
    @JoinColumn(name ="fk_cliente")
    private Cliente cliente;

    public Endereco(DadosEndereco dados) {
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }
}
