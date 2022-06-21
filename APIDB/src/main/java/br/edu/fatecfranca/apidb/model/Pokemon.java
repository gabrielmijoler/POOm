package br.edu.fatecfranca.apidb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // entidade de banco de dados
@Table(name="pokemon") // uma tabela
public class Pokemon {
	
	// definiremos a chave primária auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="tipo")
	private String tipo;
	@Column(name="peso")
	private float peso;
	@Column(name="altura")
	private float altura;
	@Column(name="tipoBola")
	private String tipoBola;
	
	public Pokemon() {
		
	}
	public Pokemon(Long id, String nome, String tipo, float peso, float altura, String tipoBola) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.peso = peso;
		this.altura = altura;
		this.tipoBola = tipoBola;
	}

	
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getTipoBola() {
		return tipoBola;
	}
	public void setTipoBola(String tipoBola) {
		this.tipoBola = tipoBola;
	}
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", peso=" + peso + ", altura=" + altura
				+ ", tipoBola=" + tipoBola + "]";
	}

	
}
