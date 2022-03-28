package entities; // pacote de entidades

public class Triangle { //criação da  classe triangulo

	public double a; //parametro da classe
	public double b;
	public double c;
	
	public double area() { // metodo para calcular a area
		double p = (a+b+c)/2.0;
		double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return result;
		
		// seria e mesma coisa: return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		
	}
	
}
