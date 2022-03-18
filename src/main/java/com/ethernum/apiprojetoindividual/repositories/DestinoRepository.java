package com.ethernum.apiprojetoindividual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ethernum.apiprojetoindividual.entities.Destino;


@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long>{

}
