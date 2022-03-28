package Application;

import java.util.Locale;
import java.util.Scanner;
import util.conversao;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println ("VAMOS CALCULAR A TRANSA��O DE DOLAR");
		System.out.println ("QUAL O VALOR DA COTA��O DE HOJE?");
		double cotacao = sc.nextDouble();
		System.out.println ("QUANTOS DOLARES VOC� TEM?");
		double dolar = sc.nextDouble();
		
		double resultado = conversao.convesaroDolarParaReal(cotacao, dolar);
		
		System.out.println ("VOC� PAGAR�:");
		System.out.printf ("%.2f%n", resultado);
		
		
		
		
		
		sc.close();
		

	}


}
