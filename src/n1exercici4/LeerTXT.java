package n1exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

public class LeerTXT {

	public static void main(String[] args) throws IOException {
		
		String archivo = "C:\\Users\\anna1\\Documents\\IT ACADEMY\\ArbolList.txt";
		readTXT (archivo);
		
	}
		
		public static void readTXT (String archivo) throws IOException {
		
		 File file = new File(
				 archivo);
	
		        BufferedReader txt  = new BufferedReader(new FileReader(file));
		 
		        String string;
		        
		        while ((string = txt.readLine()) != null)
		 
		            System.out.println(string);
		    }
	

}



