package Application;

import java.util.Locale;
import java.util.Scanner;

import etities.operations;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double saldo;
		operations operations;
		System.out.println("BEM VINDO AO GGP SEU BANCO DIGITAL");
		System.out.println("Entre com os Dados da Conta");
		System.out.print("Enter Account number ");
		int ctaNumber = sc.nextInt();
		System.out.print("Enter Account Holder ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit? (y/n)");
		char initialValueOption = sc.nextLine().charAt(0);
		
		
		 if(initialValueOption == 'y') {
				System.out.print("Enter Initial Value Deposit ");
				saldo = sc.nextDouble();
				operations = new operations (name, ctaNumber, saldo );
		 }
		 else {
			 operations = new operations (name, ctaNumber);

		 }

		
		System.out.println(" ");
		System.out.println(operations);
		
		System.out.println(" ");
		System.out.println("Entre com Valor para Deposito: ");
		saldo = sc.nextDouble();
		operations.addSaldo(saldo);
		System.out.print("Valor atiuzalizado");
		System.out.println(" ");
		System.out.println(operations);
	
		System.out.println(" ");
		System.out.println("Entre com Valor para Saque: ");
		saldo = sc.nextDouble();
		operations.removerSaldo(saldo);
		System.out.print("Valor atiuzalizado");
		System.out.println(" ");
		System.out.println(operations);
		
		
		sc.close();
	}

}
