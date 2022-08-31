package br.com.dh.clinica.controllers;

import br.com.dh.clinica.dtos.ConsultaDto;
import br.com.dh.clinica.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/consultas")

public class ConsultaController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    ConsultaService service;

    @GetMapping
    public ResponseEntity<List<ConsultaDto>> buscarTodasConsultas() {
        List<ConsultaDto> list = service.buscarTodasConsultas();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ConsultaDto> buscarConsultaPorId(@PathVariable Integer id) {
        ConsultaDto dto = service.buscarConsultaPorId(id);
        return ResponseEntity.ok().body(dto);
    }
}
