package br.unip.lpoo.threads;

public class ExemploThread {

	// Mostra uma mensagem de acordo com o nome da thread atual

	static void mensagemDaThread(String messagem) {
		System.out.println(System.currentTimeMillis());
		String nomeDaThread =
				Thread.currentThread().getName();
		System.out.format("%s: %s%n",nomeDaThread,messagem);
	}

	private static class LoopDaMensagem implements Runnable {
		public void run() {
			String mensagens[] = {
					"Lpoo é a primeira matéria de java",
					"Depois vem LPOO",
					"Finalmente quem sobrevive",
					"Ai sim pode pegar o diploma"
			};
			try {
				for (int i = 0;	i < mensagens.length; i++) {
					// Pause for 4 seconds
					Thread.sleep(4000);
					// Print a message
					mensagemDaThread(mensagens[i]);
				}
			} catch (InterruptedException e) {
				mensagemDaThread("Thread não finalizada!");
			}
		}
	}

	public static void main(String args[])
			throws InterruptedException {

		mensagemDaThread("Iniciando a thread com o loop da mensagem");
		long startTime = System.currentTimeMillis();
		Thread[] t = new Thread[300];
		for(int i=0;i<300;i++){
			t[i]= new Thread(new LoopDaMensagem());
//			t[i].setPriority(i+1);
			t[i].start();
		}
			mensagemDaThread("Esperando a thread terminar");
			// loop enquando a thread do LoopDaMensagem não termina
//			while (t.isAlive()) {
//				mensagemDaThread("Ainda esperando...");
//				// Espera 1s para o loop terminar
//				t.join(1000);
//				if (((System.currentTimeMillis() - startTime) > paciencia)
//						&& t.isAlive()) {
//					mensagemDaThread("Cansei de esperar!");
//					t.interrupt();
//					// Não vai demorar muito agora
//					t.join();
//				}
//			}
			mensagemDaThread("Finalmente!");
		}
	}



