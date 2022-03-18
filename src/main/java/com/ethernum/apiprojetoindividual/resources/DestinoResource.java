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

import com.ethernum.apiprojetoindividual.entities.Destino;
import com.ethernum.apiprojetoindividual.services.DestinoService;


@RestController
@RequestMapping("/destino")
@CrossOrigin(origins = "*")
public class DestinoResource {
		
	@Autowired 
	private DestinoService service; 
		
	@GetMapping
	public List<Destino> findAll(){
		return service.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Destino> save(@RequestBody Destino destino){
		service.save(destino);
		return ResponseEntity.ok().body(destino);
	}
	
	@DeleteMapping(value="/{id_destino}")
	public ResponseEntity <Destino> delete(@PathVariable Long id_destino){
		service.delete(id_destino);
		Destino destino = service.getById(id_destino);
		return ResponseEntity.ok().body(destino);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(service.getById(id));
	}
	
	@PutMapping(value = "/")
	public ResponseEntity<Destino> uptade(@RequestBody Destino destino){
		service.save(destino);
		return ResponseEntity.ok().body(destino);
	}
}