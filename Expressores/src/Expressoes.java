import java.util.Locale;

public class Expressoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int x = 45;
		double y = 4.0;
		double resul;	 
		resul =(double) x*y;
		System.out.printf(" o Resultado é: %.2f%n", resul);
		resul =(double) x/y;
		System.out.printf(" o Resultado é: %.2f%n", resul);
		resul = x+y;
		System.out.printf(" o Resultado é: %.0f%n", resul);
		resul = x-y;
		System.out.printf(" o Resultado é: %.0f%n", resul);
		

	}

}
