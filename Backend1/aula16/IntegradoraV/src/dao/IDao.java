package dao;

import entities.Pacientes;

public interface IDao<T> {
    T salvar(T t);

}
