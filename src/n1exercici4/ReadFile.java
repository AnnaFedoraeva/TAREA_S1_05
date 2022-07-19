package n1exercici4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader fichero = new BufferedReader(new FileReader(args[0]));
		try {
			StringBuilder string = new StringBuilder();
			String line = fichero.readLine();

			while (line != null) {
				string.append(line);
				string.append(System.lineSeparator());
				line = fichero.readLine();
			}
			String everything = string.toString();
			System.out.println(string.toString());
		} finally {
			fichero.close();
		}

	}
}
