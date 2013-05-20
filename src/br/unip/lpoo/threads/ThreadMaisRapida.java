package br.unip.lpoo.threads;

import java.util.Random;
import java.util.UUID;

public class ThreadMaisRapida implements Runnable{

	private static long initThread;
	private static int quantidade=0;
	
//	public static synchronized int[] meuMetodo(){
//		int[] resultado = new int[quantidade];
//		Random rand = new Random(1000);
//		for(int contador =0;contador<quantidade;contador ++){
//			resultado[contador] = rand.nextInt();
//		}
//		
//		return resultado;
//	}
	
	public void run() {
		single();
		System.out.println("Thread-"+Thread.currentThread().getName()+" "+(System.currentTimeMillis()-initThread));
	}
	
	public ThreadMaisRapida(int quantidade) {
		this.quantidade = quantidade;
	}

	public int[] single(){
	int[] resultado = new int[quantidade];
	Random rand = new Random(1000);
	for(int contador =0;contador<quantidade;contador ++){
		resultado[contador] = rand.nextInt();
	}
	
	return resultado;
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadMaisRapida(25000000));
		Thread t2 = new Thread(new ThreadMaisRapida(25000000));
		Thread t3 = new Thread(new ThreadMaisRapida(25000000));
		Thread t4 = new Thread(new ThreadMaisRapida(25000000));
//		ThreadMaisRapida sing = new ThreadMaisRapida(100000000);
		long init = System.currentTimeMillis();
//		sing.single();
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);
		long fim = System.currentTimeMillis();
		System.out.println(fim-init);
		initThread = System.currentTimeMillis();
		t4.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
//		try {
//			Thread.currentThread().sleep(10000);
//			t1.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("terminou");
	}

}
