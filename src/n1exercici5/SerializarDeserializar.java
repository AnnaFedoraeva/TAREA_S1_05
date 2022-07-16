package n1exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class SerializarDeserializar implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String fichero = "C:\\Users\\anna1\\Documents\\IT ACADEMY\\ArbolList.ser";
		
		serializar(fichero);
		deserializar(fichero);
	}
		
		public static void serializar (String fichero) throws IOException {
		
		            FileOutputStream file = new FileOutputStream(fichero);
		            ObjectOutputStream objSer = new ObjectOutputStream(file);
		            objSer.writeObject("Fecha actual");
		            objSer.writeObject(new Date());
		            objSer.close();
		            file.close();

	}
		
		public static void deserializar (String fichero) throws IOException, ClassNotFoundException {
			FileInputStream file = new FileInputStream(fichero);
            ObjectInputStream objDes = new ObjectInputStream(file);
            System.out.println((String)objDes.readObject());
            System.out.println((Date)objDes.readObject());
            objDes.close();
            file.close();
		}

}
