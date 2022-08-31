package br.com.dh.clinica.services;

import br.com.dh.clinica.dtos.PacienteDto;
import br.com.dh.clinica.entities.Paciente;
import br.com.dh.clinica.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
// Minha classe vai acesasr repositories e repositories vai acessar serv
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<PacienteDto> buscarTodosPacientes() {
        List<Paciente> list = repository.findAll();
        return list.stream().map(x->new PacienteDto(x)).collect(Collectors.toList());
    }

    public PacienteDto buscarPacientePorId(Integer id) {
        Optional<Paciente> objeto = repository.findById(id);
        Paciente entidade = objeto.get();
        return new PacienteDto(entidade);
    }
}
