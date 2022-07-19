package n1exercici1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lista {

	public static void main(String[] args) throws IOException {

		File archivoFile = new File(args[0]);
		File[] files = archivoFile.listFiles();

		Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));
		for (File file : files) {
			System.out.println("FILE " + file.getName());
		}
		
		//O usando el concepto de Java List Directory
		Files.list(Paths.get(args[1])).sorted().forEach(System.out::println);

	}
	

}
