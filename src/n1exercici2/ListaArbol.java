package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ListaArbol {

	public static void main(String[] args) {
		File archivo = new File(args[0]);

		File[] files = archivo.listFiles();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		sort(files, dateFormat);

	}

	public static void sort(File[] files, SimpleDateFormat dateFormat) {

		Arrays.sort(files, (f1, f2) -> Boolean.compare(f2.isDirectory(), f1.isDirectory()));

		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("D " + dateFormat.format(new Date(file.lastModified())) + " " + file.getName());
			} else {
				System.out.println("F " + dateFormat.format(new Date(file.lastModified())) + " " + file.getName());
			}
		}
	}
}
//		}
