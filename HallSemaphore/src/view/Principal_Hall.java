package src.view;

import java.util.concurrent.Semaphore;

import src.controller.ThreadCorredor;

public class Principal_Hall {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int idPessoa = 0; idPessoa < 4; idPessoa++) {
			Thread tCorredor = new ThreadCorredor(semaforo);
			tCorredor.start();
		}
	}
}
