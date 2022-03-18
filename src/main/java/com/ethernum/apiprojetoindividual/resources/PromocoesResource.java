package com.ethernum.apiprojetoindividual.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ethernum.apiprojetoindividual.entities.Promocoes;
import com.ethernum.apiprojetoindividual.services.PromocoesService;


@RestController
@RequestMapping("/promocoes")
@CrossOrigin(origins = "*")
public class PromocoesResource {
	
	@Autowired
	private PromocoesService service;

	@GetMapping
	public List<Promocoes> findAll(){
		return service.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Promocoes> save(@RequestBody Promocoes promocoes){
		service.save(promocoes);
		return ResponseEntity.ok().body(promocoes);
	}
	
	@DeleteMapping(value="/{id_promocoes}")
	public ResponseEntity <Promocoes> delete(@PathVariable Long id_promocoes){
		service.delete(id_promocoes);
		Promocoes promocoes = service.getById(id_promocoes);
		return ResponseEntity.ok().body(promocoes);
	}
	
	@PutMapping(value = "/")
	public ResponseEntity<Promocoes> uptade(@RequestBody Promocoes promocoes){
		service.save(promocoes);
		return ResponseEntity.ok().body(promocoes);
	}
	
}
