package br.unip.lpoo.threads;

public class ExemploPrioridades extends Thread {
   private int countDown = 5;
   private volatile double d = 0; 
   public ExemploPrioridades(int priority) {
      setPriority(priority);
      start();
   }
   public String toString() {
      return super.toString() + ": " + countDown;
   }
   public void run() {
      while(true) {
         for(int i = 1; i < 100000000; i++)
         d = d + (Math.PI + Math.E) / (double)i;
         System.out.println(this);
         if(--countDown == 0) return;
      }
   }
   public static void main(String[] args) {
      new ExemploPrioridades(Thread.MAX_PRIORITY);
      for(int i = 0; i < 10; i++)
      new ExemploPrioridades(Thread.MIN_PRIORITY);
   }
} 
