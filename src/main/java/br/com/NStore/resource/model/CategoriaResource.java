package br.com.NStore.resource.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoriaResource {

    @JsonProperty("nome")
    private String nome;

    @JsonCreator
    public CategoriaResource(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CategoriaResource{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
