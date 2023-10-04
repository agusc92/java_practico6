package alquileres_peliculas_autos;

public abstract class Item {
	private String tipo;
	public Item(String tipo) {
		this.tipo = tipo;
	}
	
	protected abstract boolean disponible();
	protected abstract boolean alquilar();
	protected abstract void devolver();
}
