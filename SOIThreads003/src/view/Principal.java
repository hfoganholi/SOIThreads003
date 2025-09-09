package view;

import java.util.Random;
import controller.ThreadVetor;

public class Principal {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random rand = new Random();

        // Preenche vetor com valores de 1 a 100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1;
        }

        // Cria as duas threads
        ThreadVetor t1 = new ThreadVetor(1, vetor);
        ThreadVetor t2 = new ThreadVetor(2, vetor);

        // Inicia as threads
        t1.start();
        t2.start();
    }
}
