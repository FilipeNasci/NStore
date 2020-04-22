package br.com.NStore.datasource.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9208322459050796438L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;


    public Categoria() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
