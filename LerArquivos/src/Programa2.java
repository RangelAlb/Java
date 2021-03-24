import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa2 {

	public static void main(String[] args) {

		String caminho = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
