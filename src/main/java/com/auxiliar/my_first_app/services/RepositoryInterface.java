package com.auxiliar.my_first_app.services;

import java.util.List;

public interface RepositoryInterface<T> {
    public List<T> getAll();
    public T create(T data);
    public T show(Long id);
    public T update(Long id, T data);
    public T delete(Long id);
}
