package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.model.Casa;

public interface CasaRepository extends JpaRepository<Casa, Long>{

	// esta classe interface terá à disposição os métodos de banco de dados para classe Casa
	// save
	// findAll
	// findById
	// delete
}
