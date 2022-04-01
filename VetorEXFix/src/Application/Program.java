package Application;
import java.util.Locale;
import java.util.Scanner;

import Entities.Roons;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		Roons [] vect = new Roons[10];
		
		
		System.out.println("QUANTOS QUARTOS VOCÊ QUER ALUGAR?");
		int qtyRoonsRent = sc.nextInt();
		
		for (int i=1; i<=qtyRoonsRent;i++) {
			sc.nextLine();
			System.out.printf("Locação #%d%n",i);
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Quarto Escolhido: ");
			int room = sc.nextInt();
			vect [room] = new Roons( name, email);
		}
		
		System.out.println("");
		
		System.out.println("Quartos Alugados:");
		 
		for (int i=0;i<10;i++) {
			 if (vect[i] != null) {
				 System.out.printf ("Quarto Numero: %d,",i, "  %n");
				 System.out.println (vect[i]);			 
				 
			 }
			 else {
				 System.out.printf ("Quarto Numero: %d , VAGO%n",i);
			 } 			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc. close ();
	}

}
