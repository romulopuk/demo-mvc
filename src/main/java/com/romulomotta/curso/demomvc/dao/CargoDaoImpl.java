package com.romulomotta.curso.demomvc.dao;

import com.romulomotta.curso.demomvc.domain.Cargo;
import org.springframework.stereotype.Repository;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
}
