package Entities;

public class Cadastro {
	
	public String nome;
	public double salario;
	public double percAumento;
	public double taxa;
	
	public double salarioLiquido () {
		
		return salario-taxa;
		
	}
	public double aumento () {
		
		return salario - (salario * (percAumento/100) );
	
	}

}
