package Application;

import java.util.Locale;
import java.util.Scanner;
import util.conversao;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println ("VAMOS CALCULAR A TRANSAÇÃO DE DOLAR");
		System.out.println ("QUAL O VALOR DA COTAÇÃO DE HOJE?");
		double cotacao = sc.nextDouble();
		System.out.println ("QUANTOS DOLARES VOCÊ TEM?");
		double dolar = sc.nextDouble();
		
		double resultado = conversao.convesaroDolarParaReal(cotacao, dolar);
		
		System.out.println ("VOCÊ PAGARÁ:");
		System.out.printf ("%.2f%n", resultado);
		
		
		
		
		
		sc.close();
		

	}


}
