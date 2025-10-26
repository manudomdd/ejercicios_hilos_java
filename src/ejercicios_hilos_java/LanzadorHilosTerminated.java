package ejercicios_hilos_java;

public class LanzadorHilosTerminated {
	
	 private static final Object LOCK = new Object();

	 public static void main(String[] args) throws InterruptedException {
	        Thread t = new Thread(new Hilo("finalizado"));
	        t.start();
	        t.join();
	        System.out.println(t.getName() + " -> " + t.getState());
	    }
	
}
