package br.com.NStore.resource.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProdutoResource {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("id_categoria")
    private String idCatergoria;

    @JsonProperty("descricao")
    private String descrição;

    @JsonProperty("marca")
    private String marca;

    @JsonCreator
    public ProdutoResource(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdCatergoria() {
        return idCatergoria;
    }

    public void setIdCatergoria(String idCatergoria) {
        this.idCatergoria = idCatergoria;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ProdutoResource{" +
                "nome='" + nome + '\'' +
                ", idCatergoria=" + idCatergoria +
                ", descrição='" + descrição + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
