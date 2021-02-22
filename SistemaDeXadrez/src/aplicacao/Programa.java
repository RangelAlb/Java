package aplicacao;

import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.XadrezPosicao;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();

		while (true) {
			UI.imprimirTabuleiro(partidaDeXadrez.getPecas());
			System.out.println();
			System.out.println("Origem: ");
			XadrezPosicao origem = UI.lerXadrezPosicao(sc);

			System.out.println();
			System.out.println("Destino: ");
			XadrezPosicao destino = UI.lerXadrezPosicao(sc);

			PecaDeXadrez pecaCapturada = partidaDeXadrez.moverPeca(origem, destino);
		}
	}

}
