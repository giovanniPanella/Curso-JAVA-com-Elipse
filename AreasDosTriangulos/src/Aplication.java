import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double xA, xB, xC, yA, yB,yC;
		
		System.out.println("Entre com as Medidadas do Triangulo X");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Entre com as Medidadas do Triangulo Y");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA+xB+xC)/2;
		double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		
		p = (yA+yB+yC)/2;
		double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
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
