package alquileres_peliculas_autos;

public class Pelicula extends Item {
	public String titulo;
	public int cantDisponible;
	public String genero;
	public Pelicula(String tipo, String titulo,String genero,int cant) {
		super(tipo);
		this.titulo = titulo;
		this.genero = genero;
		this.cantDisponible = cant;
	}

	@Override
	public boolean disponible() {
		
		return this.cantDisponible >0;
	}

	@Override
	public boolean alquilar() {
		if(this.disponible()) {
			cantDisponible --;
			return true;
		}else {
			return false;
		}

	}
	
	@Override
	public String toString(){
		return "La pelicula: "+this.titulo;
	}
	
	public void devolver() {
		this.cantDisponible ++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCantDisponible() {
		return cantDisponible;
	}

	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
