import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("Posição Inválida!");	
		}
		catch (InputMismatchException e) {
			System.out.println("Input Inválido!");
		}
			System.out.println("Fim do programa");
			
		sc.close();
		
	}

}
