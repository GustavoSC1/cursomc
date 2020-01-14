package com.gustavo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.cursomc.domain.Estado;

@Repository
//JpaRepository contém API para operações básicas de CRUD e também API para paginação e classificação.
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
