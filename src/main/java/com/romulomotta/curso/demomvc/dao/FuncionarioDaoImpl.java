package com.romulomotta.curso.demomvc.dao;

import com.romulomotta.curso.demomvc.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
}
