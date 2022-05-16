package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nome;
	private String cnpj;
	private List<Funcionario> funcionario;
	

	public Empresa(String cNome, String cCnpj) {
		this.nome = cNome;
		this.cnpj = cCnpj;
		this.funcionario = new ArrayList<Funcionario>();
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public List<Funcionario> getFuncionario(){
		return this.funcionario;
	}
	
	public void setNome(String cNome) {
		this.nome = cNome;
	}
	
	public void setCnpj(String cCnpj) {
		this.cnpj = cCnpj;
	}
	
	public void addFunctiony(Funcionario cFuncionario, int qtd) {
		if(this.funcionario.size() < qtd) {
			this.funcionario.add(cFuncionario);
		}
	}
}