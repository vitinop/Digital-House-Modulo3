package br.com.dh.clinica.controllers;

import br.com.dh.clinica.dtos.DentistaDto;
import br.com.dh.clinica.services.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/dentistas")

public class DentistaController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    DentistaService service;

    @GetMapping
    public ResponseEntity<List<DentistaDto>> buscarTodosDentistas() {
        List<DentistaDto> list = service.buscarTodosDentistas();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<DentistaDto> buscarDentistaPorId(@PathVariable Integer id) {
        DentistaDto dto = service.buscarDentistaPorId(id);
        return ResponseEntity.ok().body(dto);
    }
}
