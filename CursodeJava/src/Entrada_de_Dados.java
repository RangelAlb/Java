import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_Dados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x, s1;
		int y;
		double z;
		char n;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		n = sc.next().charAt(0);

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(n);

		sc.close();
	}

}
