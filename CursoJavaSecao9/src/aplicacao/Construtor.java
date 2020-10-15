package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Construtor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto();
		
		System.out.println("Entre com os dados: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		
		Produto produto = new Produto(nome, preco);
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto);
		System.out.println();
		
		System.out.print("Digite o número de produtos pra add no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + produto);
		System.out.println();
		
		System.out.print("Digite o número de produtos pra remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + produto);
		sc.close();
		}

	}


