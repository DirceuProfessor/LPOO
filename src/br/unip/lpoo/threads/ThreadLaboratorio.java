package br.unip.lpoo.threads;

public class ThreadLaboratorio implements Runnable {

	private String[] array;
	
	public ThreadLaboratorio(int tamanho) {
		this.array = new String[tamanho];
	}

	private long fim;
	private static long inicio;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		inicio =System.currentTimeMillis();
		ThreadLaboratorio threadLaboratorio = new ThreadLaboratorio(2500000);
		Thread t = new Thread(threadLaboratorio);
		t.start();
		ThreadLaboratorio threadLaboratorio2 = new ThreadLaboratorio(2500000);
		Thread t2 = new Thread(threadLaboratorio2);
		t2.start();
		ThreadLaboratorio threadLaboratorio3 = new ThreadLaboratorio(2500000);
		Thread t3 = new Thread(threadLaboratorio3);
		t3.start();
		ThreadLaboratorio threadLaboratorio4 = new ThreadLaboratorio(2500000);
		Thread t4 = new Thread(threadLaboratorio4);
		t4.start();
	}

	@Override
	public void run() {
		for(int contador=0;contador<this.array.length;contador++){
			this.array[contador] = contador+"";
			System.out.println(contador);
		}
		fim = System.currentTimeMillis();
		System.out.println(fim-inicio);
	}

}
