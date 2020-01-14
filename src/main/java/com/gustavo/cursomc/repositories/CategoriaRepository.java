package com.gustavo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.cursomc.domain.Categoria;

@Repository
//JpaRepository contém API para operações básicas de CRUD e também API para paginação e classificação.
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
