package com.agro.curso.boot.service;

import java.util.List;

import com.agro.curso.boot.domain.Cargo;
import com.agro.curso.boot.domain.Departamento;
import com.agro.curso.boot.domain.Funcionario;

public interface FuncionarioService {


	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();
}
