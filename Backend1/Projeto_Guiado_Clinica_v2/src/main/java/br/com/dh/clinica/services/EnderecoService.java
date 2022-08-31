package br.com.dh.clinica.services;

import br.com.dh.clinica.dtos.EnderecoDto;
import br.com.dh.clinica.entities.Endereco;
import br.com.dh.clinica.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
// Minha classe vai acesasr repositories e repositories vai acessar serv
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public List<EnderecoDto> buscarTodosEnderecos() {
        List<Endereco> list = repository.findAll();
        return list.stream().map(x->new EnderecoDto(x)).collect(Collectors.toList());
    }

    public EnderecoDto buscarEnderecoPorId(Integer id) {
        Optional<Endereco> objeto = repository.findById(id);
        Endereco entidade = objeto.get();
        return new EnderecoDto(entidade);
    }
}
