package entities;

public class Product {
	public String name;
	public double price;
	public int quantidade;
	
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
		return name + " , R$ "+ String.format("%.2f", price)+ ", "+ quantidade + " unidades, Total R$ "+ String.format("%.2f",totalNoEstoque ()) ;
	}

}
