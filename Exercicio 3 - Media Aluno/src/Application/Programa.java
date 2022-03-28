package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Aluno aluno = new Aluno();
		
		
		System.out.println("Digite os Dados dos Alunos");
		System.out.println("Nome: ");
		aluno.aluno = sc.nextLine();  
		System.out.println("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		
		System.out.println(" ");
		System.out.printf ("Media Final %.2f%n", aluno.trimestre1());
		
		
		
		if ((aluno.trimestre1()) > 60) {
			System.out.println("Passou");
		}
		else {
			System.out.println("Reprovou");
			System.out.printf("Faltou: %.2f pontos", aluno.teste());
		}
		
		
		
		
		sc.close();

	}

}
