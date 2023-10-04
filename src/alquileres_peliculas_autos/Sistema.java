package alquileres_peliculas_autos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<Alquiler> alquileres;
	private ArrayList<Cliente> clientes;
	private ArrayList<Item> items;
	public Sistema() {
		alquileres = new ArrayList<>();
		clientes = new ArrayList<>();
		items = new ArrayList<>();
	}
	
	public void agregarAlquiler(Alquiler... alq) {
		for(Alquiler a : alq) {
			alquileres.add(a);
		}
	}
	public void agregarItem(Item... item) {
		for(Item a : item) {
			items.add(a);
		}
	}
	public void agregarCliente(Cliente... clientes) {
		for(Cliente a : clientes) {
			this.clientes.add(a);
		}
	}
	
	public void alquilar(Item item,Cliente cliente,LocalDate fecha) {
		if(item.alquilar()) {
			Alquiler alquiler = new Alquiler(cliente,item,fecha);
			this.alquileres.add(alquiler);
			System.out.println("Alquilado con exito");
		}
		else {
			System.out.println("El item no se encuentra disponible");
		}
	}
	
	public void buscarVencidos() {
		for(Alquiler alq : this.alquileres) {
			if(alq.vencida()) {
				System.out.println("El cliente: "+alq.getCliente() + " debe una devolucion de:"+" \n"
						+ alq.getItem()+"que deveria haberse efectuado "+alq.getFechaLimite());
			}
		}
	}

	public ArrayList<Alquiler> getAlquileres() {
		return new ArrayList<Alquiler>(alquileres);
	}



	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		
		this.alquileres = new ArrayList<Alquiler>(alquileres);
	}
	
	


	public ArrayList<Cliente> getClientes() {
		return new ArrayList<Cliente>(clientes);
	}



	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = new ArrayList<Cliente>(clientes);
	}



	public ArrayList<Item> getItems() {
		return new ArrayList<Item>(items);
	}



	public void setItems(ArrayList<Item> items) {
		this.items = new ArrayList<Item>(items);
	}



	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Auto corsa = new Auto("gas","chevrolet",30000,"EHK033");
		Cliente cliente1 = new Cliente("Agustin",43242423);
		
		sistema.agregarCliente(cliente1);
		sistema.agregarItem(corsa);
		
		sistema.alquilar(corsa, cliente1,  LocalDate.of(2020,8,20));
		
		sistema.buscarVencidos();
		for(Alquiler alq : sistema.getAlquileres()) {
			System.out.println(alq);
		}
	}

}
