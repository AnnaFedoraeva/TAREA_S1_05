package n1exercici5;

import java.io.Serializable;

public class Coche implements Serializable {
	
	private String marca;
	private String modelo;
	private int a�o;

	Coche() {
	}

	public Coche(String marca, String modelo, int a�o) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + "]";
	};
}

	


	
