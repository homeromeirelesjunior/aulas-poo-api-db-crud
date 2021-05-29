package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.model.Imobiliaria;

public interface ImobiliariaRepository extends JpaRepository<Imobiliaria, Long> {
	
	// esta classe interface terá à disposição os métodos de banco de dados para classe Imobiliaria
	// save
	// findAll
	// findById
	// delete
}
