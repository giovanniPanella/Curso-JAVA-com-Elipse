import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Triangle x, y; //Chamo a classe Triangulo
		x = new Triangle (); //aloco na memoria o novo triangulo X
		y = new Triangle ();//aloco na memoria o novo triangulo X
		
		
		
		
		System.out.println("Entre com as Medidadas do Triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as Medidadas do Triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area(); //metodo para calcular a area
		double areaY = y.area();//metodo para calcular a area
		
		System.out.printf ("Área do Triangulo X: %.2f%n",areaX);
		System.out.printf ("Área do Triangulo Y: %.2f%n",areaY);
		if (areaX > areaY)
		{
			System.out.printf("O Triangulo com maior Área é o : X  com %.2f%n",areaX );
		}
		else
		{
			System.out.printf("O Triangulo com maior Área é o : Y  com %.2f%n",areaY );
		}
		sc.close();
	}

}
