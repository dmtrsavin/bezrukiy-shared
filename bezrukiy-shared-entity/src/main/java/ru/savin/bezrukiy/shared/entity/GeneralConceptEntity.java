package ru.savin.bezrukiy.shared.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.OffsetDateTime;

/**
 * Общая сущность имеющая название записей, дату создания и дату удаления (закрытия).
 */
@Data
@MappedSuperclass
public abstract class GeneralConceptEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "createDttm", nullable = false)
    private OffsetDateTime createDttm;

    @Column(name = "endDttm")
    private OffsetDateTime endDttm;
}
