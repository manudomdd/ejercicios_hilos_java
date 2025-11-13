package ejercicios_hilos_java;

public class Ejercicio5 { 
	
	public static void main (String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
			System.out.println("Estamos en hilo 1"); 
			
			System.out.println("Seguimos en hilo 1"); 
		}); 
		
		Thread t2 = new Thread(() -> {
			System.out.println("Estamos en hilo 2"); 
			
			System.out.println("Seguimos en hilo 2"); 
		}); 
		
		t1.start();
		System.out.println(t1.getState() + "Se esta ejecutando t1");
		System.out.println("El hilo 2 se encuentra " + t2.getState());
		t1.join();
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());
	}
}
