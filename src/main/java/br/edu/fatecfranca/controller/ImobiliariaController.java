package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.Imobiliaria;
import br.edu.fatecfranca.repositories.ImobiliariaRepository;

@RestController
public class ImobiliariaController {
	
	@Autowired
	ImobiliariaRepository injecao;
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/imobiliaria")
	public List<Imobiliaria> get() {
		return injecao.findAll();
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PostMapping("/imobiliaria")
	public String add(@RequestBody Imobiliaria imobiliaria) {
		injecao.save(imobiliaria);
		return "Imobiliária inserida com sucesso";
	}
	
	@CrossOrigin(origins= "http://127.0.0.1:5500")
	@DeleteMapping("/imobiliaria/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Exclusão realizada com sucesso";
	}
	
	@PutMapping("/imobiliaria")
	public String update(@RequestBody Imobiliaria imobiliaria) {
		injecao.save(imobiliaria);
		return "Imobiliaria atualizada com sucesso";
	}
}
