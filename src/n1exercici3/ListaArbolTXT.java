package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
//Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.

public class ListaArbolTXT {

	public static void main(String[] args) throws IOException {

		File archivo = new File("C:\\Python310");
		String archivoTXT = "C:\\Users\\anna1\\Documents\\IT ACADEMY\\ArbolList.txt";
		FileOutputStream doc = new FileOutputStream(archivoTXT);
		BufferedWriter txt = new BufferedWriter(new OutputStreamWriter(doc, "utf-8"));

		File[] files = archivo.listFiles();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		sort(files, dateFormat);
		createTXT (txt, files, dateFormat);

	}

	public static void sort(File[] files, SimpleDateFormat dateFormat) {

		Arrays.sort(files, (f1, f2) -> {
			if (f1.isDirectory() && !f2.isDirectory()) {
				return -1;
			} else if (!f1.isDirectory() && f2.isDirectory()) {
				return 1;
			} else {
				return f1.compareTo(f2);
			}
		});
	}

	public static void createTXT (BufferedWriter txt, File[] files,SimpleDateFormat dateFormat ) throws IOException {
		for (File file : files) {
			if (file.isDirectory()) {
			txt.write("D " + dateFormat.format(new Date(file.lastModified())) + " " + file.getName());
			txt.newLine();
			} else {
				txt.write("F " + dateFormat.format(new Date(file.lastModified())) + " " + file.getName());
				txt.newLine();
				
			}
		}

		txt.close();
	
	}
}
