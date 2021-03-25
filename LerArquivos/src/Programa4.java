import java.io.File;
import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		File caminho = new File(strPath);
		
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucesso);
		
		
		sc.close();

	}

}
