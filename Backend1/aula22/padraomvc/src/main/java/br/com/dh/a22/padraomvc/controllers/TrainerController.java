package br.com.dh.a22.padraomvc.controllers;

import br.com.dh.a22.padraomvc.entities.Trainer;
import br.com.dh.a22.padraomvc.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainerController {
    @Autowired
    private TrainerService service;

    public TrainerController(TrainerService service) {
        this.service = service;
    }

    @GetMapping

    public List<Trainer> buscarTodosOsTrainers(){
        return service.listTrainer();
    }
}
