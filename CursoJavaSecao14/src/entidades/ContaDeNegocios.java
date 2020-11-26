package entidades;

public class ContaDeNegocios extends Conta {

	private Double limiteDeEmprestimo;	

	public ContaDeNegocios() {
		super();
	}

	public ContaDeNegocios(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.setLimiteDeEmprestimo(limiteDeEmprestimo);
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteDeEmprestimo){
			saldo += valor - 10.0;
		}
	}
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}

}
