package org.proj.application.usuario.useCase;

import org.proj.domain.usuario.service.UsuarioService;

public class CriarUsuarioUseCase {

    private final UsuarioService usuarioService;

    CriarUsuarioUseCase(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
