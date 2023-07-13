package com.api.training.spring.boot.api.controller;

import com.api.training.spring.boot.api.domain.cliente.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

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

    @GetMapping
    public List<Cliente> listarClientes () {

        return ResponseEntity.ok(repository.findAll()).getBody();
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoCliente dados) {
        Cliente cliente = repository.getReferenceById(dados.id());

        cliente.atualizarInformacoes(dados);

        return ResponseEntity.ok(new DadosDetalhamentoCliente(cliente));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluirCliente(@PathVariable Integer id) {
        repository.deleteById(id);

        return ResponseEntity.accepted().build();
    }
}
