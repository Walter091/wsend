package org.proj.domain.usuario.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.proj.domain.usuario.model.Usuario;
import org.proj.domain.usuario.repository.UsuarioRepository;

import java.util.List;

@ApplicationScoped
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuarioRepository.buscarTodosUsuarios();
    }

    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepository.buscarUsuarioPorId(id);
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.salvarUsuario(usuario);
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        return usuarioRepository.atualizarUsuario(usuario);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deletarUsuario(id);
    }

}
