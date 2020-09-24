package src.view;

import java.util.concurrent.Semaphore;

import src.controller.ThreadF1;

public class Principal_F1 {

	public static void main(String[] args) {
		int permissaoPista = 5;
		int permissaoTabela = 1;

		Semaphore Pista = new Semaphore(permissaoPista);
		Semaphore[] Escuderia = new Semaphore[8];
		Semaphore Tabela = new Semaphore(permissaoTabela);

		for (int idEscuderia = 1; idEscuderia <= 7; idEscuderia++) {
			Escuderia[idEscuderia] = new Semaphore(1);
			for (int idCarro = 1; idCarro < 3; idCarro++) {
				Thread treino = new ThreadF1(idCarro, idEscuderia, Pista, Tabela, Escuderia[idEscuderia]);
				treino.start();
			}
		}

	}

}
