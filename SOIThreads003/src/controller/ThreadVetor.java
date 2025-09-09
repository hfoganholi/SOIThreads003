package controller;

public class ThreadVetor extends Thread {
    
	private int numero;
    private int[] vetor;

    public ThreadVetor(int numero, int[] vetor) {
        this.numero = numero;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        calc();
    	}

	private void calc() {
		// TODO Auto-generated method stub
		long inicio = System.nanoTime(); // marca o início

        if (numero % 2 == 0) {
            // número par → usa for tradicional
            for (int i = 0; i < vetor.length; i++) {
                int valor = vetor[i]; // só para simular processamento
            }
        } else {
            // número ímpar → usa foreach
            for (int valor : vetor) {
                // só para simular processamento
            }
        }

        long fim = System.nanoTime(); // marca o fim
        double tempoSegundos = (fim - inicio) / 1_000_000_000.0;

        System.out.println("Thread " + numero + " terminou em " + tempoSegundos + " segundos");
    }
}
