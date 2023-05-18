package com.api.training.spring.boot.api.controller;

import com.api.training.spring.boot.api.domain.cliente.Cliente;
import com.api.training.spring.boot.api.domain.cliente.ClienteRepository;
import com.api.training.spring.boot.api.domain.cliente.DadosCadastroCliente;
import com.api.training.spring.boot.api.domain.cliente.DadosDetalhamentoCliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class clienteController {

    @Autowired
    private ClienteRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastrarCliente (@RequestBody @Valid DadosCadastroCliente dados, UriComponentsBuilder uriBuilder) {
        Cliente cliente = new Cliente(dados);
        repository.save(cliente);

        var uri = uriBuilder.path("/cliente/{idCliente}").buildAndExpand(cliente.getIdCliente()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoCliente(cliente));
    }


}
