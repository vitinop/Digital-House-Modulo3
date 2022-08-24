package com.veiculos.dh.mesaVeiculos.services.impl;

import com.veiculos.dh.mesaVeiculos.entities.Veiculo;
import com.veiculos.dh.mesaVeiculos.services.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    @Override
    public List<Veiculo> listVeiculo(){
        return Arrays.asList(
                new Veiculo("Ferrari","Vermelho"),
                new Veiculo("Fiat","Preto"),
                new Veiculo("Honda","Prata")
        );
    }

}
