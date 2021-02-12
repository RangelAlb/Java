package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import excecoes.DomainException;
import model.entidades.Reservas;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Número do quarto: ");
			int numero = sc.nextInt();
			System.out.println("Check-in data (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out data (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			if (!checkOut.after(checkIn)) {
				System.out.println("Erro na reserva: A data de check-out deve ser posterior a data de check-in");
			} else {
				Reservas reserva = new Reservas(numero, checkIn, checkOut);
				System.out.println("Reserva: " + reserva);

				System.out.println();
				System.out.println("Entre com a data para atualizar a reserva: ");
				System.out.println("Check-in data (dd/MM/yyyy): ");
				checkIn = sdf.parse(sc.next());
				System.out.println("Check-out data (dd/MM/yyyy): ");
				checkOut = sdf.parse(sc.next());

				reserva.atualizarDatas(checkIn, checkOut);
				System.out.println("Reserva: " + reserva);
			}

		} catch (ParseException e) {
			System.out.println("Data inválida");

		} catch (DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());

		} catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		sc.close();
	}
}
