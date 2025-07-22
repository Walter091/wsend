package org.proj.application.usuario.useCase;

import org.proj.domain.usuario.service.UsuarioService;

public class EditarUsuarioUseCase {

    private final UsuarioService usuarioService;

    EditarUsuarioUseCase(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
