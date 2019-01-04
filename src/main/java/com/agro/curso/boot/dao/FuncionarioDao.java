package com.agro.curso.boot.dao;

import java.util.List;

import com.agro.curso.boot.domain.Funcionario;



public interface FuncionarioDao {
	void save(Funcionario departamento);

    void update(Funcionario departamento);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
