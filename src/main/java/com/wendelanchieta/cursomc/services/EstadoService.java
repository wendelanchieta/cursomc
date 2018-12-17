package com.wendelanchieta.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendelanchieta.cursomc.domain.Estado;
import com.wendelanchieta.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> findAll(){
		return repo.findAll();
	}
	
	public List<Estado> findAllByOrderByNome(){
		return repo.findAllByOrderByNome();
	}
	
}
