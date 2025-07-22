package org.proj.domain.usuario.repository;

import org.proj.domain.usuario.model.Usuario;

import java.util.List;

public interface UsuarioRepository {

    List<Usuario> buscarTodosUsuarios();

    Usuario buscarUsuarioPorId(Long id);

    Usuario salvarUsuario(Usuario usuario);

    Usuario atualizarUsuario(Usuario usuario);

    void deletarUsuario(Long id);

}
