package br.com.dh.a22.padraomvc.service.impl;

import br.com.dh.a22.padraomvc.entities.Trainer;
import br.com.dh.a22.padraomvc.service.TrainerService;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceimpl implements TrainerService {

    @Override
    public List<Trainer> listTrainer(){
        return Arrays.asList(
                new Trainer("Patrick"),
                new Trainer("Luiz"),
                new Trainer("Ted")
        );
    }
}
