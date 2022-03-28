package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		Product product = new Product();
		
		System.out.println("Entre com os Dados do Produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade no Estoque: ");
		product.quantidade = sc.nextInt();
		
		
		System.out.println("  ");
		System.out.println("Dados do Produto: " + product);
		System.out.println("  ");
		System.out.println("Entre com o Numero de produtos que você quer adicionar ao Estoque:  ");
		int quantidade = sc.nextInt();
		product.addProducts(quantidade);
		System.out.println("  ");
		System.out.println("Dados Atualizados: " + product);
		System.out.println("Entre com o Numero de produtos que você quer Remover do Estoque:  ");
		quantidade = sc.nextInt();
		product.removeProducts(quantidade);
		
		
		System.out.println("  ");
		System.out.println("Dados Atualizados: " + product);
		
		sc.close();
	}

}
