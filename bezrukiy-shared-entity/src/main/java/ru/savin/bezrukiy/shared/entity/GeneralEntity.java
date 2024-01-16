package ru.savin.bezrukiy.shared.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


/**
 * Общий идентификатор сущностей.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class GeneralEntity extends GeneralConceptEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
