package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Cadastro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Cadastro cadastro = new Cadastro ();
		System.out.println ("ENTRE COM OS DADOS DO FUNCINARIO");
		System.out.println ("Nome: ");
		cadastro.nome = sc.nextLine();
		System.out.println ("Salario Bruto: ");
		cadastro.salario = sc.nextDouble();
		System.out.println ("Imposto: ");
		cadastro.taxa = sc.nextDouble();
		
		System.out.println("  ");
		System.out.printf("Salario Liquido: R$ %.2f%n", cadastro.salarioLiquido());
		
		System.out.println("  ");
		System.out.println("Qual o Percentual de Aumento?:  ");
		cadastro.percAumento = sc.nextDouble();
		
		
		
		System.out.println("  ");
		System.out.printf("Novo Salario:R$ %.2f%n", cadastro.aumento());
		

		
		
		
		
		
		
		
		sc.close();
	}

}
