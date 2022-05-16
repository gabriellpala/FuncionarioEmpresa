package model;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private Empresa empresa;
	
	//Construtor da Classe
	public Funcionario(String eNome) {
		this.nome = eNome;
	}
	
	// Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public Empresa getEmpresa() {
		return this.empresa;
	}
	
	//Setters
	public void setNome(String eNome) {
		this.nome = eNome;
	}

	public void setCpf(String eCpf) {
		this.cpf = eCpf;
	}

	public void setSalario(double eSalario) {
		this.salario = eSalario;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}