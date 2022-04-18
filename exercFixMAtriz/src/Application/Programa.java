package Application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o Numero de Linhas");
		int m = sc.nextInt();
		System.out.println("Digite o Numero de Colunas");
		int n = sc.nextInt();
		int [][] mat = new int [m][n];
		
		
		
		for (int i=0; i<m;i++) {
			for (int j=0;j<n;j++) {
				mat [i][j]= sc.nextInt();
			}
		}
		
	
		
		System.out.println("Qual numero vc quer achar?");
		int num =  sc.nextInt();

		
		for (int i=0; i<m;i++) {
			for (int j=0;j<n;j++) {
				if (mat[i][j] ==num) {
					
					System.out.println("Linha "+ i + " Coluna " + j);
					
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				
				
				}
				
			}
		}
	
		
		sc.close();
		
	}

}
