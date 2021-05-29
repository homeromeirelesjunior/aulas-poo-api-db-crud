package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.Casa;
import br.edu.fatecfranca.repositories.CasaRepository;

@RestController
public class CasaController {
	
	// cria a injeção de dependência
	// usa métodos sem instanciar uma classe
	
	@Autowired
	CasaRepository injecao;
	
	@GetMapping("/casa")
	public List<Casa> get() {
		return injecao.findAll();
	}
	
	@PostMapping("/casa")
	public String add(@RequestBody Casa casa) {
		injecao.save(casa);
		return "Casa inserida com sucesso";
	}
	
	@DeleteMapping("/casa/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Casa removida com sucesso";
	}
	
	@PutMapping("/casa")
	public String update(@RequestBody Casa casa) {
		injecao.save(casa);	// esta casa terá id, então atualiza
		return "Casa atualizada com sucesso";
	}
}
