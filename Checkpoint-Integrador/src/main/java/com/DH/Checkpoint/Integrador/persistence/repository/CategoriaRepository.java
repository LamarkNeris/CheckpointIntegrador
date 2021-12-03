package com.DH.Checkpoint.Integrador.persistence.repository;

import com.DH.Checkpoint.Integrador.persistence.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
