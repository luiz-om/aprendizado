package com.agro.curso.boot.dao;

import java.util.List;

import com.agro.curso.boot.domain.Departamento;

public interface DepartamentoDao {
	void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
