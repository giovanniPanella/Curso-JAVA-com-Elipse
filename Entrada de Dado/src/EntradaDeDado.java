/*Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago.*/


import java.util.Scanner; //importa o Scanner do Teclado para o JaVA
public class EntradaDeDado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //Atribuo a entrada de dados para o Scanner sc
		String nome;
		
		System.out.printf("Digite seu nome e Tecle Enter\n");
		nome = sc.next(); // Leio o que é digitado e guardo no variavel x
		
		
		System.out.printf("Olá %s Tudo Bem? \nDigite o Total de minutos que você Utilizou neste Mês: \n", nome);
		int min, exed=0;
		double total, custo=0;
		min= sc.nextInt();
		System.out.printf("Legal vou Calcular pra Você\n");
		
		if (min>100)
		{
			exed = min-100;
			System.out.printf("Você Ultrapassou %d minutos de Sua Franquia\n", exed);
			custo = (double) exed *2;
			System.out.printf("O Custo dos min a mais é: %.2f\n", custo);
		}
		
		for (int cont=0; cont<=50; cont++) {
			System.out.printf("Contador esta em : %d\n", cont);
			
		}
		
		total = (double) 50 + custo;
		System.out.printf("Sua Fatura irá fechar em R$ %.2f%n",total);
		

		sc.close();//desabilito o Scanner
	}

}
