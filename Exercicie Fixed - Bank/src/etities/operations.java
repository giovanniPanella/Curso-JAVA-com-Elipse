package etities;

public class operations {
	private String name;
	private  int ctaNumber;
	private double saldo;
	
	
	public operations() {
		
	}
	
	public operations(String name, int ctaNumber) {
		this.name = name;
		this.ctaNumber = ctaNumber;
		
		
	}
	
	public operations(String name, int ctaNumber, double initialValue) {
		this.name = name;
		this.ctaNumber = ctaNumber;
		addSaldo (initialValue);
	}
	
	


	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getCtaNumber() {
		return ctaNumber;
	}


	public double getSaldo() {
		return saldo;
	}


	
	
	public void addSaldo (double saldo ) {
		
		this.saldo = saldo + this.saldo;	
		
		
	}
	
	public void removerSaldo (double saldo) {
		this.saldo = this.saldo - saldo - 5.00;
		
	}
	
	
	public String toString() {
		return "Conta: "
				+ getCtaNumber()
				+ ", Titular: "
				+ getName()
				+ ", Saldo: R$ "
				+ String.format ("%.2f %n ", getSaldo())
				+ "GGP SEU BANCO DIGITAL ";
		
		
		
		
	}
	
	
	

}
