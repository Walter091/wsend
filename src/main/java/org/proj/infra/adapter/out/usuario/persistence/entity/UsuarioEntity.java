package org.proj.infra.adapter.out.usuario.persistence.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "usuarios")
public class UsuarioEntity extends PanacheMongoEntity {
}
