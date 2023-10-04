package centro_de_computo;

public class Computadora {
	private double memoriaDisponible;
	public boolean disponible;
	public Computadora(double memoria) {
		this.memoriaDisponible = memoria;
		this.disponible = true;
	}
	
	public void procesar(Proceso proc) {
		
		if(proc.getMemoriaRequerida()<=this.memoriaDisponible && !proc.isProcesado()) {
			proc.setProcesado(true);
			this.disponible = false;
		}else {
			System.out.println("Hubo un error");
		}
	}
	public double getMemoriaDisponible() {
		return memoriaDisponible;
	}
	public void setMemoriaDisponible(double memoriaDisponible) {
		this.memoriaDisponible = memoriaDisponible;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	
}
