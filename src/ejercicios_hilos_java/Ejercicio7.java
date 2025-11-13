/**
 * Ejercicio 7 · Interrumpiendo hilos interrupt() isInterrupted()
Crea un hilo que cuente indefinidamente y, desde el hilo principal, 
interrúmpelo después de unos segundos para que termine de forma limpia.
 */

package ejercicios_hilos_java;

public class Ejercicio7 {

    public static void main(String[] args) throws InterruptedException {
        
    	//Crea un hilo que cuente indefinidamente y, desde el hilo principal
    	
    	Thread t1 = new Thread (() -> {
    	 	int contador = 0;
    	 	try {
    	 		while (!Thread.currentThread().isInterrupted()) {
        	 		System.out.println("Contador: " + contador++);
        	 		Thread.sleep(500);
        	 	}
    	 	} catch (InterruptedException ex) {
    	 		System.out.println("Hilo interrumpido."); 
    	 	}
    	 	
    	 	System.out.println("El hilo finalizo"); 
    	 	
    	}); 
	 	
	 	try {
	 		t1.start();
        	Thread.sleep(2000);
    	} catch (InterruptedException ex) {
    		System.out.println("Programa interrumpido"); 
    	}
    	t1.interrupt();
    	t1.join(); 
    	
    	/**
         * En el hilo, usa un bucle while (!Thread.currentThread().isInterrupted()).
         * 
			Dentro del bucle, imprime un contador y haz sleep(500).
			En el main, tras start(), espera con sleep(2000) y luego llama a t.interrupt().
			Maneja InterruptedException terminando el hilo con un mensaje claro.
         */
    }
}

