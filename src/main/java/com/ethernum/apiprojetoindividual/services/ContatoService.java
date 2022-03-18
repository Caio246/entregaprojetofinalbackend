package com.ethernum.apiprojetoindividual.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ethernum.apiprojetoindividual.entities.Contato;
import com.ethernum.apiprojetoindividual.repositories.ContatoRepository;


@Service                        
public class ContatoService {
	
	@Autowired
	private ContatoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Contato> findAll(){
		List<Contato> resultado = repository.findAll();
		return resultado;
	}

	public void save(Contato contato) {
		try {
			repository.save(contato);
		} catch (Exception ex) {
			throw ex;
		}
	}

	public Contato getById(Long id_contato) {
		Optional<Contato> contato = repository.findById(id_contato);
		if (contato.isPresent()) {
			return contato.get();
		} else {
			return null;
		}
	}

	public void delete(Long id_contato) {
		Optional<Contato> contato = repository.findById(id_contato);
		if (contato.isPresent()) {
			repository.delete(contato.get());
			System.out.println(contato.get().getNome());
		} else {
			System.out.println("Contato não encontrado");
		}
	}

	public void update(Contato contato) {
		try {
			repository.save(contato);
		} catch (Exception ex) {
			throw ex;
		}
	}
}
