package app.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 

@Entity
@Table(name = "EMPREGADO_IFC")
public class Empregado {
	private int id;

	private String nome;
	private String cargo;
	private Date data_contratacao;
	private Float salario;



	public Empregado() {
	}

	public Empregado(int id, String nome, String cargo, Date data_contratacao, Float salario) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.data_contratacao = data_contratacao;
		this.salario = salario;
	}

	@Id
	@Column(name = "EMP_ID")
	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	@Column(name = "EMP_NAME", length = 50, nullable = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String empName) {
		this.nome = empName;
	}

	@Column(name = "CARGO", length = 30, nullable = false)
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String job) {
		this.cargo = job;
	}

	@Column(name = "DATA_CONTRATACAO", nullable = false)
	@Temporal(TemporalType.DATE)
	public Date getData_contratacao() {
		return data_contratacao;
	}

	public void setData_contratacao(Date data_contratacao) {
		this.data_contratacao = data_contratacao;
	}

	@Column(name = "SALARIO", nullable = false)
	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}


}

