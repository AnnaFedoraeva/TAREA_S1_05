package n1exercici5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EscribirLeer {
	public static void main(String[] args) {

		Coche coche1 = new Coche("Toyota", "Corolla", 2020);
		Coche coche2 = new Coche("Kia","Rio", 2020);

		try {
			FileOutputStream fileOut = new FileOutputStream(new File("C:\\Users\\anna1\\Documents\\IT ACADEMY\\objeto.txt"));
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

			// escribir el objeto en un fichero
			objOut.writeObject(coche1);
			objOut.writeObject(coche2);

			objOut.close();
			fileOut.close();

			FileInputStream fileIn = new FileInputStream(new File("C:\\Users\\anna1\\Documents\\IT ACADEMY\\objeto.txt"));
			ObjectInputStream objIn = new ObjectInputStream(fileIn);

			// Leer el objeto
			Coche c1 = (Coche) objIn.readObject();
			Coche c2 = (Coche) objIn.readObject();

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
