package ru.savin.bezrukiy.shared.service;

/**
 * Базовый CRUD.
 *
 * @param <D> ДТО.
 * @param <U> ДТО обновления.
 */
public interface CrudService<D, U> {

    /**
     * Получение данных.
     * @param name Название/Наименование.
     * @return D ДТО.
     */
    D get(String name);


    /**
     * Сохранение данных.
     *
     * @param dto ДТО.
     * @return D ДТО.
     */
    D save(D dto);

    /**
     * Обновление данных.
     *
     * @param update ДТО с новыми данными.
     * @return D ДТО.
     */
    D update(U update);

    /**
     * Удаление данных.
     *
     * @param name Название/Наименование.
     * @return @{@link String} Статус удаления.
     */
    String delete(String name);
}
