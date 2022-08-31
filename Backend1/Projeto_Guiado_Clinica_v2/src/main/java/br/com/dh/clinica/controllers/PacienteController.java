package br.com.dh.clinica.controllers;

import br.com.dh.clinica.dtos.PacienteDto;
import br.com.dh.clinica.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")

public class PacienteController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    PacienteService service;

    @GetMapping
    public ResponseEntity<List<PacienteDto>> buscarTodosPacientes() {
        List<PacienteDto> list = service.buscarTodosPacientes();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PacienteDto> buscarPacientePorId(@PathVariable Integer id) {
        PacienteDto dto = service.buscarPacientePorId(id);
        return ResponseEntity.ok().body(dto);
    }
}
