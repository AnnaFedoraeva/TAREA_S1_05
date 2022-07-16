package n1exercici1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lista {
	
	//Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
	public static void main(String[] args) throws IOException {
		String archivo = "D:\\";
		File archivoFile = new File("D:/");

		getNames(archivo);
		sort(archivoFile);
	}

	public static void getNames(String archivo) throws IOException {

		Files.list(Paths.get(archivo)).sorted().forEach(System.out::println);

	}

	public static void sort(File archivoFile) {

		File[] files = archivoFile.listFiles();

		Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));
		for (File file : files) {
			System.out.println("FILE\t" + file.getName());
		}
	}

}
