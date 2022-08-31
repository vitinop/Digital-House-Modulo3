package br.com.dh.clinica.services;

import br.com.dh.clinica.dtos.UsuarioDto;
import br.com.dh.clinica.entities.Usuario;
import br.com.dh.clinica.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
// Minha classe vai acesasr repositories e repositories vai acessar serv
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioDto> buscarTodosUsuarios() {
        List<Usuario> list = repository.findAll();
        return list.stream().map(x->new UsuarioDto(x)).collect(Collectors.toList());
    }

    public UsuarioDto buscarUsuarioPorId(Integer id) {
        Optional<Usuario> objeto = repository.findById(id);
        Usuario entidade = objeto.get();
        return new UsuarioDto(entidade);
    }

}
