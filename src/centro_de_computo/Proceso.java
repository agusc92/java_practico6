package centro_de_computo;

public class Proceso {
	private double memoriaRequerida;
	public boolean procesado;
	public Proceso(double memoria) {
		this.memoriaRequerida = memoria;
		this.procesado = false;
	}
	public double getMemoriaRequerida() {
		return memoriaRequerida;
	}
	public void setMemoriaRequerida(double memoriaRequerida) {
		this.memoriaRequerida = memoriaRequerida;
	}
	public boolean isProcesado() {
		return procesado;
	}
	public void setProcesado(boolean procesado) {
		this.procesado = procesado;
	}
	
	

}
