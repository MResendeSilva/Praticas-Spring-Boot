package com.basic.api.training.domain.cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cliente")
@Entity(name = "Cliente")
@Getter
@EqualsAndHashCode(of = "idCliente")
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
}
