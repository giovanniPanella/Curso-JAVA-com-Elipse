package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos Funcionarios você quer Registrar");
		int qtyFuncionarios = sc.nextInt();
		
		List <Funcionarios> list = new ArrayList<>();
		
		
		for (int i=1; i<=qtyFuncionarios;i++) {
			sc.nextLine();
			System.out.printf("Fincionario #%d%n",i);
			System.out.println("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			double salario = sc.nextInt();
			
			Funcionarios emp = new Funcionarios (id,nome,salario);
			
			list.add (emp);
		
		}
		System.out.println("-----------------------------------------");
		System.out.println("Dados inseridos");
		System.out.println("-----------------------------------------");
		System.out.println(" ");
		for(Funcionarios x: list) {
			
			System.out.println("ID: " + x.getId()+" NOME: "+ x.getNome()+ ", SALARIO R$ "+ x.getSalario());
		}
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Entre com o ID do Funcionario para Aumento: ");
		int id = sc.nextInt();
		
		Funcionarios nid = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (nid == null) {
			System.out.println("Numero ID inválido");	
		}
		else {
			System.out.println("Entre com o percentual");
			double perc = sc.nextDouble();
			nid.novoSalario(perc);
			
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Dados com Salarios Reajustados: ");
		System.out.println("-----------------------------------------");
		for(Funcionarios x: list) {
			
			System.out.printf("ID: " + x.getId()+" NOME: "+ x.getNome()+ ", SALARIO R$ "+ x.getSalario());
		}
		
		
		
		
		sc.close();
	}

}
