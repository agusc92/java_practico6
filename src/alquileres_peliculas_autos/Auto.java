package alquileres_peliculas_autos;

public class Auto extends Item {
	private String patente;
	private String marca;
	private int kilometros;
	private boolean disponible;
	public Auto(String tipo, String marca, int kilometros , String patente) {
		super(tipo);
		this.marca = marca;
		this.kilometros = kilometros;
		this.patente = patente;
		this.disponible = true;
	}

	@Override
	public boolean disponible() {
		
		return this.disponible;
	}
	
	@Override
	public boolean alquilar() {
		if(this.disponible) {
			this.disponible = false;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void devolver() {
		this.disponible = true;
	}
	
	@Override
	public String toString() {
		return "Un auto de la marca "+this.marca +"con patente: "+this.patente;
	}
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	
	
	

}
