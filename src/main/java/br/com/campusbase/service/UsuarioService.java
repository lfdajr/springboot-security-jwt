package br.com.campusbase.service;

import br.com.campusbase.model.Usuario;
import br.com.campusbase.repository.UsuarioRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    private final UsuarioRepositorio repositorio;

    @Autowired
    public UsuarioService(UsuarioRepositorio userRepository) {
        this.repositorio = userRepository;
    }

    public UsuarioRepositorio getUserRepository() {
        return repositorio;
    }

    public Optional<Usuario> getByUsername(String username) {
        return this.repositorio.findByUsername(username);
    }
    
}
