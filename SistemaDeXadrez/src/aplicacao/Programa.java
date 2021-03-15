package aplicacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.XadrezException;
import xadrez.XadrezPosicao;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		List<PecaDeXadrez> capturada = new ArrayList();

		while (true) {
			try {
				UI.limparTela();
				UI.imprimirPartida(partidaDeXadrez, capturada);
				System.out.println();
				System.out.println("Origem: ");
				XadrezPosicao origem = UI.lerXadrezPosicao(sc);

				boolean[][] movimentosPossiveis = partidaDeXadrez.movimentosPossiveis(origem);
				UI.limparTela();
				UI.imprimirTabuleiro(partidaDeXadrez.getPecas(), movimentosPossiveis);			
				System.out.println();
				System.out.println("Destino: ");
				XadrezPosicao destino = UI.lerXadrezPosicao(sc);

				PecaDeXadrez pecaCapturada = partidaDeXadrez.moverPeca(origem, destino);
				
				if(pecaCapturada != null) {
					capturada.add(pecaCapturada);
				}

			} catch (XadrezException e) {
				System.out.println(e.getMessage());
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}

}
