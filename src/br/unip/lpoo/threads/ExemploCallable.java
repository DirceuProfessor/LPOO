package br.unip.lpoo.threads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import br.unip.lpoo.aula4.beans.Professor;

public class ExemploCallable implements Callable<Integer>{

	private Integer indice;
	
	public ExemploCallable(int indice) {
this.indice=indice;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Set<Future<Integer>> set = new HashSet<Future<Integer>>();
		Future<Integer> futuro =null;
		for(int i=0;i<20;i++){
			futuro = executor.submit(new  ExemploCallable(i));
			set.add(futuro);
		}
		int soma = 0;
		try {
			for (Future<Integer> resultadoFuturo : set) {

				soma += resultadoFuturo.get();

			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (ExecutionException e) {

			e.printStackTrace();
		}
		System.out.printf("A soma ’ndices Ž %s%n", soma);
		System.exit(soma);

	}

	@Override
	public Integer call() throws Exception {

		return indice;
	}

}
