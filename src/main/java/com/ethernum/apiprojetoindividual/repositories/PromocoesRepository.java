package com.ethernum.apiprojetoindividual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ethernum.apiprojetoindividual.entities.Promocoes;


@Repository
public interface PromocoesRepository extends JpaRepository<Promocoes, Long>{

}