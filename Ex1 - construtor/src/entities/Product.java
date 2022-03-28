package entities;

public class Product {
	private String name;
	private double price;
	private int quantidade;
	
	
	public Product() {
		
	} 
	
	public Product(String name, double price, int quantidade) {
		this.name = name;
		this.price = price;
		this.quantidade = quantidade;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantidade() {
		return quantidade;
	}


	public double totalNoEstoque () {
		return price*quantidade;
		
	}
	
	public void addProducts (int quantidade) {
		this.quantidade = quantidade+this.quantidade; //o this se refere a variavel da classe produto		
		
		
	}
	
	public void removeProducts (int quantidade) {
		this.quantidade -= quantidade; //igual a formula anterior só que reduzida
	}
	public String toString() {
		return name +
				" , R$ "+ 
				String.format("%.2f", price)+ 
				", "+ quantidade + 
				" unidades, Total R$ "+ 
				String.format("%.2f",totalNoEstoque ()) ;
	}

}
