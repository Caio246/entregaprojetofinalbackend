package com.ethernum.apiprojetoindividual.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ethernum.apiprojetoindividual.entities.Destino;
import com.ethernum.apiprojetoindividual.repositories.DestinoRepository;


@Service
public class DestinoService {

	@Autowired
	private DestinoRepository repository;

	@Transactional(readOnly = true)
	public List<Destino> findAll() {
		List<Destino> resultado = repository.findAll();
		return resultado;
	}

	public void save(Destino destino) {
		try {
			repository.save(destino);
		} catch (Exception ex) {
			throw ex;
		}
	}

	public Destino getById(Long id_destino) {
		Optional<Destino> destino = repository.findById(id_destino);
		if (destino.isPresent()) {
			return destino.get();
		} else {
			return null;
		}
	}

	public void delete(Long id_destino) {
		Optional<Destino> destino = repository.findById(id_destino);
		if (destino.isPresent()) {
			repository.delete(destino.get());
			System.out.println(destino.get().getNome());
		} else {
			System.out.println("Destino não encontrado");
		}
	}

	public void update(Destino destino) {
		try {
			repository.save(destino);
		} catch (Exception ex) {
			throw ex;
		}
	}

}
