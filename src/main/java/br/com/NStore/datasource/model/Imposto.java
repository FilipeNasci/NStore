package br.com.NStore.datasource.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "impostos")
public class Imposto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5750345790112542147L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private float aliquota;

    public Imposto(){    }

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

    public float getAliquota() {
        return aliquota;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }
}
