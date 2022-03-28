package application;

import java.util.Locale;
import java.util.Scanner;

import entities.triangulo;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		

		
		
	
			triangulo triangulo = new triangulo ();
			System.out.println("Entre os Valores da Base e Altura do Retângulo ");
			triangulo.alt = sc.nextDouble();
			triangulo.larg = sc.nextDouble();
			
			System.out.println(triangulo);


	
		sc.close();
}
}
