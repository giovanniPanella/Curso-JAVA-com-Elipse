package entities;

public class triangulo {
	public double larg;
	public double alt;
	
	public double area() {
		return larg*alt;
	}
	
	public double perimetro() {
		return 2*(larg+alt);
	}
	 public double diagonal() {
		 return Math.sqrt((alt*alt)+(larg*larg));
	 }

	 public String toString() {
		 return "Area = " + String.format("%.2f%n", area())+ "Perimetro= " + String.format("%.2f%n", perimetro()) + "Diagonal = " + String.format("%.2f%n", diagonal());
	 }
}
