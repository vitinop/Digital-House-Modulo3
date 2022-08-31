package br.com.dh.clinica.controllers;

import br.com.dh.clinica.dtos.EnderecoDto;
import br.com.dh.clinica.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/enderecos")

public class EnderecoController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    EnderecoService service;

    @GetMapping
    public ResponseEntity<List<EnderecoDto>> buscarTodosEnderecos() {
        List<EnderecoDto> list = service.buscarTodosEnderecos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EnderecoDto> buscarEnderecoPorId(@PathVariable Integer id) {
        EnderecoDto dto = service.buscarEnderecoPorId(id);
        return ResponseEntity.ok().body(dto);
    }
}
