package entities;

public class Aluno {
	public String aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double trimestre1( ) {
		return (nota1+nota2+nota3);
	}
	
	public double teste () {
		
		if ((trimestre1()) < 60) {
			return 60 - trimestre1();
		}
		else {
			return 0.0;
		}	
		
	}
	
	
	

}
