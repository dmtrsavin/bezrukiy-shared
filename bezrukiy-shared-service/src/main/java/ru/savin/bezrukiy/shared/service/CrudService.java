package ru.savin.bezrukiy.shared.service;

/**
 * Базовый CRUD.
 *
 * @param <D> - ДТО.
 * @param <E> - Сущность.
 */
public interface CrudService<D, E> {

    /**
     * Получение данных.
     * @param name - Название/Наименование.
     * @return D - ДТО.
     */
    D get(String name);


    /**
     * Сохранение данных.
     *
     * @param entity - Сущность.
     * @return D - ДТО.
     */
    D save(E entity);

    /**
     * Обновление данных.
     *
     * @param entity - Сущность.
     * @return D - ДТО.
     */
    D update(E entity);

    /**
     * Удаление данных.
     *
     * @param name - Название/Наименование.
     * @return @{@link String} - Статус удаления.
     */
    String delete(String name);
}
