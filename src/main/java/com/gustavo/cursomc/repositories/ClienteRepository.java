package com.gustavo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gustavo.cursomc.domain.Cliente;

@Repository
//JpaRepository contém API para operações básicas de CRUD e também API para paginação e classificação.
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

		@Transactional(readOnly=true)
		Cliente findByEmail(String email);
}
