package ru.savin.bezrukiy.shared.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

/**
 * Общий идентификатор для файл сущностей.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class GeneralFileStorageEntity extends GeneralConceptEntity {

    @Id
    @GeneratedValue
    @Column(name = "file_id")
    private UUID fileId;
}