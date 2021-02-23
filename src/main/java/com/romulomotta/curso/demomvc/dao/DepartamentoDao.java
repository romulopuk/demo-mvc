package com.romulomotta.curso.demomvc.dao;

import com.romulomotta.curso.demomvc.domain.Departamento;

import java.util.List;

public interface DepartamentoDao {

    public void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
