package br.com.dh.clinica.services;

import br.com.dh.clinica.dtos.ConsultaDto;
import br.com.dh.clinica.entities.Consulta;
import br.com.dh.clinica.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
// Minha classe vai acesasr repositories e repositories vai acessar serv
public class ConsultaService {

    @Autowired
    private ConsultaRepository repository;

    public List<ConsultaDto> buscarTodasConsultas() {
        List<Consulta> list = repository.findAll();
        return list.stream().map(x->new ConsultaDto(x)).collect(Collectors.toList());
    }

    public ConsultaDto buscarConsultaPorId(Integer id) {
        Optional<Consulta> objeto = repository.findById(id);
        Consulta entidade = objeto.get();
        return new ConsultaDto(entidade);
    }
}
