package entidades;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {	
		this.quantidade = this.quantidade + quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}

}
