package br.unip.lpoo.threads;

public class ExemploThreadLaboratorio implements Runnable{

	@Override
	public void run() {
		for(long x =0; x<120000;x++){
			System.out.println("Imprime x:"+x+" "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ExemploThreadLaboratorio exemploLab1 = new ExemploThreadLaboratorio();
		Thread t = new Thread(exemploLab1);
		t.start();

		ExemploThreadLaboratorio exemploLab2 = new ExemploThreadLaboratorio();
		Thread u = new Thread(exemploLab2);
		u.start();


		ExemploThreadLaboratorio exemploLab3 = new ExemploThreadLaboratorio();
		Thread v = new Thread(exemploLab3);
		v.start();

		ExemploThreadLaboratorio exemploLab4 = new ExemploThreadLaboratorio();
		Thread x = new Thread(exemploLab4);
		x.start();
		long fim = System.currentTimeMillis();

		System.out.println("Tempo: "+(fim-start));
	}

}
