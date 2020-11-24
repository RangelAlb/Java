package aplicacao;

import entidades.Conta;
import entidades.ContaDeNegocios;
import entidades.ContaPoupanca;

public class Heranca {

	public static void main(String[] args) {
	
     Conta acc = new Conta(1001, "Alex", 0.0);
     
     ContaDeNegocios bacc = new ContaDeNegocios(1002, "Maria", 0.0, 500.0);
		
     
     // UPCASTING
     
     Conta acc1 = bacc;
     Conta acc2 = new ContaDeNegocios(1003, "Bob", 0.0, 200.0);
     Conta acc3 = new ContaPoupanca(1004,"Anna", 0.0, 0.1);
     
     // DOWNCASTING
     
     ContaDeNegocios acc4 = (ContaDeNegocios)acc2;
     acc4.emprestimo(100.0);
     
     // ContaDeNegocios acc5 = (ContaDeNegocios)acc3;
     
     if (acc3 instanceof ContaDeNegocios) {
      ContaDeNegocios acc5 = (ContaDeNegocios)acc3;
      acc5.depositar(200);
      System.out.println("Empréstimo!");
      
     }
     
     if (acc3 instanceof ContaPoupanca) {
    	 ContaPoupanca acc5 = (ContaPoupanca)acc3;
    	 acc5.atualizarSaldo();
    	 System.out.println("Atualizado!");
     }
     
		
	}

}
