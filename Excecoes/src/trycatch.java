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
		 System.out.println("Posi��o Inv�lida!");	
		}
		catch (InputMismatchException e) {
			System.out.println("Input Inv�lido!");
		}
			System.out.println("Fim do programa");
			
		sc.close();
		
	}

}
