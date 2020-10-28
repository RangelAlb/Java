package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
		    String nome = sc.nextLine();
		    double preco = sc.nextDouble();
		    vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("MEDIA DE PREÇO = %.2f%n", media);
		
		sc.close();
	}

}
