package br.com.NStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.NStore.datasource.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
