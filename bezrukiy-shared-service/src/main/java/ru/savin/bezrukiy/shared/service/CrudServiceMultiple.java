package ru.savin.bezrukiy.shared.service;

import java.util.List;

public interface CrudServiceMultiple<D, U> extends CrudService<D, U> {

    List<D> get(List<D> dto);
    void save(List<D> dto);
    void update(List<U> dto);
    void delete(List<String> dto);
}
