package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();
		System.out.println("Entre com os dados do produto: ");

		System.out.println("Nome: ");
		produto.nome = sc.nextLine();

		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();

		System.out.println("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto.toString());

		sc.close();

	}

}
