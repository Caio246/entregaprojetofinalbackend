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

import com.ethernum.apiprojetoindividual.entities.Contato;
import com.ethernum.apiprojetoindividual.services.ContatoService;


@RestController
@RequestMapping("/contato")
@CrossOrigin(origins = "*")
public class ContatoResource {
	
	@Autowired
	private ContatoService service; 
	
	@GetMapping
	public List<Contato> findAll(){
		return service.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Contato> save(@RequestBody Contato contato){
		service.save(contato);
		return ResponseEntity.ok().body(contato);
	}
	
	@DeleteMapping(value="/{id_contato}")
	public ResponseEntity <Contato> delete(@PathVariable Long id_contato){
		service.delete(id_contato);
		Contato contato = service.getById(id_contato);
		return ResponseEntity.ok().body(contato);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(service.getById(id));
	}
	
	@PutMapping(value = "/")
	public ResponseEntity<Contato> uptade(@RequestBody Contato contato){
		service.save(contato);
		return ResponseEntity.ok().body(contato);
	}
}

