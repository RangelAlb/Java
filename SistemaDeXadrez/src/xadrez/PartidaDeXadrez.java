package xadrez;

import jogodetabuleiro.Peca;
import jogodetabuleiro.Posicao;
import jogodetabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configuracaoInicial();
	}

	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}

		return mat;
	}
	
	public boolean[][] movimentosPossiveis(XadrezPosicao posicaoOrigem) {
		Posicao posicao = posicaoOrigem.toPosicao();
		validarPosicaoOrigem(posicao);
		return tabuleiro.peca(posicao).movimentosPossiveis();
	}

	public PecaDeXadrez moverPeca(XadrezPosicao posicaoOrigem, XadrezPosicao posicaoDestino) {
		Posicao origem = posicaoOrigem.toPosicao();
		Posicao destino = posicaoDestino.toPosicao();
		validarPosicaoOrigem(origem);
		validarPosicaoDestino(origem, destino);
		Peca pecaCapturada = fazerMovimento(origem, destino);
		return (PecaDeXadrez) pecaCapturada;
	}

	private Peca fazerMovimento(Posicao origem, Posicao destino) {
		Peca p = tabuleiro.removerPeca(origem);
		Peca pecaCapturada = tabuleiro.removerPeca(origem);
		tabuleiro.colocarPeca(p, destino);
		return pecaCapturada;
	}

	private void validarPosicaoOrigem(Posicao posicao) {
		if (!tabuleiro.temUmaPeca(posicao)) {
			throw new XadrezException("Nao existe peca na posicao de origem.");
		}
		if (!tabuleiro.peca(posicao).existeAlgumMovimentoPossivel()) {
			throw new XadrezException("Não existe movimentos possiveis para a peca escolhida.");
		}
	}

	private void validarPosicaoDestino(Posicao origem, Posicao destino) {
		if (!tabuleiro.peca(origem).movimentoPossivel(destino)) {
			throw new XadrezException("A peca escolhida nao pode se mover para a posicao de destino.");
		}
	}

	private void colocarNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());

	}

	private void configuracaoInicial() {
		colocarNovaPeca('c', 1, new Torre(tabuleiro, Cor.WHITE));
		colocarNovaPeca('c', 2, new Torre(tabuleiro, Cor.WHITE));
		colocarNovaPeca('d', 2, new Torre(tabuleiro, Cor.WHITE));
		colocarNovaPeca('e', 2, new Torre(tabuleiro, Cor.WHITE));
		colocarNovaPeca('e', 1, new Torre(tabuleiro, Cor.WHITE));
		colocarNovaPeca('d', 1, new Rei(tabuleiro, Cor.WHITE));

		colocarNovaPeca('c', 7, new Torre(tabuleiro, Cor.BLACK));
		colocarNovaPeca('c', 8, new Torre(tabuleiro, Cor.BLACK));
		colocarNovaPeca('d', 7, new Torre(tabuleiro, Cor.BLACK));
		colocarNovaPeca('e', 7, new Torre(tabuleiro, Cor.BLACK));
		colocarNovaPeca('e', 8, new Torre(tabuleiro, Cor.BLACK));
		colocarNovaPeca('d', 8, new Rei(tabuleiro, Cor.BLACK));

	}
}
