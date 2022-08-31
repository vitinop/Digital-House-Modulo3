package br.com.dh.clinica.controllers;

import br.com.dh.clinica.dtos.UsuarioDto;
import br.com.dh.clinica.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")

public class UsuarioController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> buscarTodosUsuarios() {
        List<UsuarioDto> list = service.buscarTodosUsuarios();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UsuarioDto> buscarUsuarioPorId(@PathVariable Integer id) {
        UsuarioDto dto = service.buscarUsuarioPorId(id);
        return ResponseEntity.ok().body(dto);
    }
}
