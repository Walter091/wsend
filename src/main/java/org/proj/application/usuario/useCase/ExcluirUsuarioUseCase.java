package org.proj.application.usuario.useCase;

import org.proj.domain.usuario.service.UsuarioService;

public class ExcluirUsuarioUseCase {

    private final UsuarioService usuarioService;

    ExcluirUsuarioUseCase(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
