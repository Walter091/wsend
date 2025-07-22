package org.proj.infra.adapter.out.usuario.persistence.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.proj.infra.adapter.out.usuario.persistence.entity.UsuarioEntity;

@ApplicationScoped
public interface UsuarioEntityRepository extends PanacheMongoRepository<UsuarioEntity> {

}
