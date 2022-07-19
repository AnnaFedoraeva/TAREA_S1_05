package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ListaArbolTXT {

	public static void main(String[] args) throws IOException {

		File archivo = new File(args[0]);
		String archivoTXT = args[1];
		FileOutputStream doc = new FileOutputStream(archivoTXT);
		BufferedWriter txt = new BufferedWriter(new OutputStreamWriter(doc, "utf-8"));

		File[] files = archivo.listFiles();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		sort(files);
		createTXT(txt, files, dateFormat);

	}

	public static void sort(File[] files) {

		Arrays.sort(files, (f1, f2) -> Boolean.compare(f2.isDirectory(), f1.isDirectory()));
	}

	public static void createTXT(BufferedWriter txt, File[] files, SimpleDateFormat dateFormat) throws IOException {
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
