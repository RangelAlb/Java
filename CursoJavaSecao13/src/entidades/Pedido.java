package entidades;

import java.util.Date;

import entidades.enums.PedidoStatus;

public class Pedido {

	private Integer id;
	private Date instante;
	private PedidoStatus status;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date instante, PedidoStatus status) {
		this.id = id;
		this.instante = instante;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", instante=" + instante + ", status=" + status + "]";
	}
	
	
	
	
	
}
