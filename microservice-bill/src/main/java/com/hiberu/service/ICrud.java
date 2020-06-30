package com.hiberu.service;

import java.util.List;

public interface ICrud<T> {

    T register(T obj);
    T update(T obj);
    List<T> list();
}
