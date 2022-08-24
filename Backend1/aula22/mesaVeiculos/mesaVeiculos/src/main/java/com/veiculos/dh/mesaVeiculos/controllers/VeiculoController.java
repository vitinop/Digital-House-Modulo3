package com.veiculos.dh.mesaVeiculos.controllers;

import com.veiculos.dh.mesaVeiculos.entities.Veiculo;
import com.veiculos.dh.mesaVeiculos.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")

public class VeiculoController {
    @Autowired
    private VeiculoService service;

    public VeiculoController(VeiculoService service){
        this.service = service;
    }

    @GetMapping

    public List<Veiculo> buscarTodosOsVeiculos(){
        return service.listVeiculo();
    }

}
