package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
			list.add("Maria");
			list.add("Bob");
			list.add("Alex");
			list.add("Aline");
			list.add("Tati");
			list.add("Giovanni");
			list.add("Gilles");
			list.add(2,"Marco"); //adicionando o cara no endereço
	
		for(String x: list) {
			
			System.out.println(x);
		}
		System.out.println("----------");
		
		list.remove("Tati");//remove por data
		list.remove(0);//remove por posicao
		list.removeIf( x -> x.charAt(0) =='A'); //remover por predicado 
		
		for(String x: list) {
					
					System.out.println(x);
				}
		
		System.out.println("----------");
		System.out.println("Index of Giovanni: "+ list.indexOf("Giovanni")); //procura na posicao		
		System.out.println("----------");

		List<String> result = list.stream().filter (x -> x.charAt(0) =='G').collect(Collectors.toList());
		
		for(String x: result) {
			
			System.out.println(x);
		}
		System.out.println("----------");
		String name = list.stream().filter(x -> x.charAt(0)=='G').findFirst().orElse(null);
		
		System.out.println (name);
		
		System.out.println("----------");
		String name1 = list.stream().filter(x -> x.charAt(0)=='H').findFirst().orElse(null);
		
		System.out.println (name1);
		
		
		
	}

}
