package n1exercici5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Main implements Serializable {

	private String marca;
	private String modelo;
	private int año;

	public Main(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String file = args[0];

		Main coche1 = new Main("Toyota", "Corolla", 2020);
		Main coche2 = new Main("Kia", "Rio", 2020);

		try {
			FileOutputStream fileOut = new FileOutputStream(new File(file));
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

			// Escribir los objetos en un fichero
			objOut.writeObject(coche1);
			objOut.writeObject(coche2);

			objOut.close();
			fileOut.close();

			FileInputStream fileIn = new FileInputStream(new File(file));
			ObjectInputStream objIn = new ObjectInputStream(fileIn);

			// Leer los objetos
			Main c1 = (Main) objIn.readObject();
			Main c2 = (Main) objIn.readObject();

			System.out.println(c1.toString());
			System.out.println(c2.toString());

			objIn.close();
			fileIn.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
