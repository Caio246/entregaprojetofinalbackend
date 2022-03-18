package com.ethernum.apiprojetoindividual.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ethernum.apiprojetoindividual.entities.Promocoes;
import com.ethernum.apiprojetoindividual.repositories.PromocoesRepository;


@Service
public class PromocoesService {
	
	@Autowired
	private PromocoesRepository repository;
	
	@Transactional(readOnly = true)
	public List<Promocoes> findAll(){
		List<Promocoes> resultado = repository.findAll();
		return resultado;
	}
	
	public void save(Promocoes promocoes) {
		try {
			repository.save(promocoes);
		} catch (Exception ex) {
			throw ex;
		}
	}

	public Promocoes getById(Long id_promocoes) {
		Optional<Promocoes> promocoes = repository.findById(id_promocoes);
		if (promocoes.isPresent()) {
			return promocoes.get();
		} else {
			return null;
		}
	}

	public void delete(Long id_promocoes) {
		Optional<Promocoes> promocoes = repository.findById(id_promocoes);
		if (promocoes.isPresent()) {
			repository.delete(promocoes.get());
			System.out.println(promocoes.get().getId());
		} else {
			System.out.println("Destino não encontrado");
		}
	}

}
