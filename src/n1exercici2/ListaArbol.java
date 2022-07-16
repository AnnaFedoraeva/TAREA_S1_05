package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ListaArbol {
	// Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un
	// arbre de directoris amb el contingut de tots els seus nivells (recursivament)
	// de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada
	// nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva
	// última data de modificació.

	public static void main(String[] args) {
		File archivo = new File("C:\\Python310");

		File[] files = archivo.listFiles();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		sort(files, dateFormat);

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

		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("D " + dateFormat.format(new Date(file.lastModified())) + " " + file.getName());
			} else {
				System.out.println("F " + dateFormat.format(new Date(file.lastModified())) + " " + file.getName());
			}
		}
	}
}
