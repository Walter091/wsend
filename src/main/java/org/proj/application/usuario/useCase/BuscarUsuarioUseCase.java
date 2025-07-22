package org.proj.application.usuario.useCase;

import jakarta.enterprise.context.ApplicationScoped;
import org.proj.domain.usuario.service.UsuarioService;

@ApplicationScoped
public class BuscarUsuarioUseCase {

    private final UsuarioService usuarioService;

    BuscarUsuarioUseCase(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


}
