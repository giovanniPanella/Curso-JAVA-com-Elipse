package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [][] mat = new int [n][n];
		
		for (int i=0; i<n;i++) {
			for (int j=0;j<n;j++) {
				mat [i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Numeros da Diagonal");
		for (int i=0; i<n;i++) {
			for (int j=0;j<n;j++) {
				if (i==j) {
					System.out.print(mat [i][j] + " ");
				}
				
			}
		}
		System.out.println(" ");
		System.out.println("Numeros Negativos");
		
		int cont =0;
		for (int i=0; i<n;i++) {
			for (int j=0;j<n;j++) {
				if(mat[i][j] <0) {
					cont++;
					
					
				}
				
			}
		}
		System.out.print(cont);
		
		sc.close();
		
	}

}
