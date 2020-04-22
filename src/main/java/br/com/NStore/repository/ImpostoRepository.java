package br.com.NStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.NStore.datasource.model.Imposto;

public interface ImpostoRepository extends JpaRepository<Imposto, Long> {
}
