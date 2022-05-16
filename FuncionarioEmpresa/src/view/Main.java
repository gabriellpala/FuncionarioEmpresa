package view;

import java.util.Scanner;
import model.Funcionario;
import model.Empresa;

public class Main {

    public static void main(String[] args) {
    	
    	int cont = 0;
        	
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Empresa Name: ");
			String cNome = input.next();

			System.out.print("CNPJ da Empresa: ");
			String cnpj = input.next();
			     
			Empresa empresa01 = new Empresa(cNome, cnpj);
			     
			System.out.print("Enter the number of employees the empresa has: ");
			int qtd = input.nextInt();
			     
			while(cont < qtd){
				
				System.out.print("Employee's name: ");
				String eNome = input.next();
			     
			    System.out.print("CPF of the employee: ");
			    String cpf = input.next();

			    System.out.print("Employee Salary: ");
			    double salario = input.nextDouble();
			         
			    Funcionario funcionario01 = new Funcionario(eNome);
			         
			    funcionario01.setCpf(cpf);
			    funcionario01.setSalario(salario);
			    
			    System.out.println(empresa01.getNome());
			    System.out.println(empresa01.getCnpj());
			    

				System.out.println(funcionario01.getNome());
				System.out.println(funcionario01.getCpf());
				System.out.println(funcionario01.getSalario());
				
				cont++;

			}
		}
    }
}