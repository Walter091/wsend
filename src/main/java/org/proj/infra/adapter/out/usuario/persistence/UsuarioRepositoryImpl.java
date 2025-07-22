package org.proj.infra.adapter.out.usuario.persistence;

import jakarta.enterprise.context.ApplicationScoped;
import org.proj.domain.usuario.model.Usuario;
import org.proj.domain.usuario.repository.UsuarioRepository;
import org.proj.infra.adapter.out.usuario.persistence.repository.UsuarioEntityRepository;

import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Inject
    UsuarioEntityRepository usuarioEntityRepository;

    @Override
    public List<Usuario> buscarTodosUsuarios() {
        return List.of();
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario atualizarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void deletarUsuario(Long id) {

    }
}
