package com.romulomotta.curso.demomvc.dao;

import com.romulomotta.curso.demomvc.domain.Departamento;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {
}
