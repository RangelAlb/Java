package entidade;

public class Produto {

	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//Sobrecarga
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Getters e Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	//Funções
	public double totalNoEstoque() {
	return preco * quantidade;
	}
	public void addProduto(int quantidade) {
	this.quantidade += quantidade;
	}
	public void removeProduto(int quantidade) {
	this.quantidade -= quantidade;
	}
	public String toString() {
	return nome
	+ ", R$ "
	+ String.format("%.2f", preco)
	+ ", "
	+ quantidade
	+ " unidades, Total: R$ "
	+ String.format("%.2f", totalNoEstoque());
	
	}
}
