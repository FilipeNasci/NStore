package br.com.NStore.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteResource {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("cpf")
    private String cpf;
    
    @JsonProperty("telefone")
    private String telefone;
    
    @JsonProperty("email")
    private String email;

    @JsonProperty("endereco")
    private String endereco;

    public ClienteResource() {}
    
    public ClienteResource(@JsonProperty("nome") String nome,@JsonProperty("cpf") String cpf, @JsonProperty("telefone") String telefone, @JsonProperty("email") String email,
    @JsonProperty("endereco") String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
	public String toString() {
		return "ClienteResource [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
}
