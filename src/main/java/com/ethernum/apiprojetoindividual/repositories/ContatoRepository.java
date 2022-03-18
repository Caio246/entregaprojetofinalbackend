package com.ethernum.apiprojetoindividual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ethernum.apiprojetoindividual.entities.Contato;


@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
