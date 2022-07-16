package n1exercici5;

import java.io.Serializable;

public class Coche implements Serializable {
	
	private String marca;
	private String modelo;
	private int año;

	Coche() {
	}

	public Coche(String marca, String modelo, int año) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
	};
}

	


	
