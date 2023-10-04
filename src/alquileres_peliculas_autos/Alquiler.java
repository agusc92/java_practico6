package alquileres_peliculas_autos;

import java.time.LocalDate;

public class Alquiler {
	private Cliente cliente;
	private Item item;
	private LocalDate fechaLimite;
	public Alquiler(Cliente cliente, Item item, LocalDate date) {
		this.cliente = cliente;
		this.item = item;
		this.fechaLimite = date;
	}
	
	public boolean vencida() {
		return fechaLimite.isBefore(LocalDate.now());
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public LocalDate getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	
	@Override
	public String toString() {
		return this.cliente.getNombre() + this.item.toString() +" "+this.fechaLimite;
	}

}
