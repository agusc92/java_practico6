package centro_de_computo;

import java.util.ArrayList;

public class Centro {
	private ArrayList<Computadora> computadoras;
	private ArrayList<Proceso> procesos;
	private Ordenador ordenador;
	
	public Centro(Ordenador ordenador) {
		this.ordenador = ordenador;
	}

	public void agregarProceso(Proceso ... proc) {
		for(Proceso p : proc) {
			this.procesos.add(p);
		}
	}
	
	public void agregarComputadora(Computadora ...compu ) {
		for(Computadora c : compu) {
			this.computadoras.add(c);
		}
	}
	
	public void ordenarComputadoras(ArrayList<Computadora> arrcomp,Ordenador ord){
		this.ordenador.ordenar((ArrayList<Object>)arrcomp);
	}
	
	public ArrayList<Computadora> getComputadoras() {
		return new ArrayList<Computadora>(computadoras);
	}

	public void setComputadoras(ArrayList<Computadora> computadoras) {
		this.computadoras = new ArrayList<Computadora>(computadoras);
	}

	public ArrayList<Proceso> getProcesos() {
		return new ArrayList<Proceso>(procesos);
	}

	public void setProcesos(ArrayList<Proceso> procesos) {
		this.procesos = new ArrayList<Proceso>(procesos);
	}

	public Ordenador getOrdenador() {
		return ordenador;
	}

	public void setOrdenador(Ordenador ordenador) {
		this.ordenador = ordenador;
	}
	
	

}
