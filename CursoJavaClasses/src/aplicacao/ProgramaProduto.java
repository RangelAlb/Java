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
		
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser removidos no estoque: ");
	    quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();

	}

}
