package br.com.NStore.resource.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ImpostoResource {
//tudo em string para o back validar
    @JsonProperty("nome")
    private String nome;

    @JsonProperty("aliquota")
    private String aliquota;

    @JsonCreator
    public ImpostoResource(@JsonProperty("nome") String nome, @JsonProperty("aliquota") String aliquota) {
        this.nome = nome;
        this.aliquota = aliquota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAliquota() {
        return aliquota;
    }

    public void setAliquota(String aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public String toString() {
        return "ImpostoResource{" +
                "nome='" + nome + '\'' +
                ", aliquota='" + aliquota + '\'' +
                '}';
    }
}
