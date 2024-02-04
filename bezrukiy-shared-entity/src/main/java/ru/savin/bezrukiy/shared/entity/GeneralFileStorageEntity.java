package ru.savin.bezrukiy.shared.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * Общий идентификатор для файл сущностей.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class GeneralFileStorageEntity extends GeneralConceptEntity {

    @Id
    @Column(name = "file_id")
    private UUID fileId = UUID.randomUUID();
}

