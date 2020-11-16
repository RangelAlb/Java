import java.util.Date;

import entidades.Pedido;
import entidades.enums.PedidoStatus;

public class Enumeracao {

	public static void main(String[] args) {


		Pedido pedido = new Pedido(1080, new Date(), PedidoStatus.AGUARDANDO_PAGAMENTO );

		
		System.out.println(pedido);
		
		
		//Conversão de String pra enum
		PedidoStatus os1 = PedidoStatus.ENTREGUE;
		
		PedidoStatus os2 = PedidoStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
