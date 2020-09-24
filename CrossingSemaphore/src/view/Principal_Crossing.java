package src.view;

import java.util.concurrent.Semaphore;

import src.controller.ThreadSemaforo;

public class Principal_Crossing {

	public static void main(String[] args) {
		int permissoes = 1;

		Semaphore semaforo = new Semaphore(permissoes);

		Thread Carro1 = new ThreadSemaforo(1, semaforo, "Norte para Sul");
		Thread Carro2 = new ThreadSemaforo(2, semaforo, "Sul para Norte");
		Thread Carro3 = new ThreadSemaforo(3, semaforo, "Leste para Oeste");
		Thread Carro4 = new ThreadSemaforo(4, semaforo, "Oeste para Leste");
		Carro1.start();
		Carro2.start();
		Carro3.start();
		Carro4.start();
	}
}