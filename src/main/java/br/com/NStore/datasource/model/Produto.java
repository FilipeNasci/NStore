package br.com.NStore.datasource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3880234428289397995L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private Long idCatergoria;
	private int quantidade;
	private String descrição;
	private String marca;
	private double precoVenda;
	//private Item item = null;

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

	public Long getIdCatergoria() {
		return idCatergoria;
	}

	public void setIdCatergoria(Long idCatergoria) {
		this.idCatergoria = idCatergoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}



//	public Item getItem() {
//		return item;
//	}

	//fila de itens
//	public void setItem(Item item) {
//		if(this.item == null){
//			this.item = item;
//		}else{
//			Item aux = this.item;
//			while (aux.getProx() != null){
//				aux = aux.getProx();
//			}
//			aux.setProx(item);
//		}
//	}
}
