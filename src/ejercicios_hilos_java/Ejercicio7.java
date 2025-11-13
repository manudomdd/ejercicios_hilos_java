package ejercicios_hilos_java;

public class Ejercicio7 { 
	
	public static void main (String[] args) throws InterruptedException {
		
		Thread t1 = new Thread (() -> {
			try {
				Thread.sleep(3000); 
			} catch (InterruptedException ex) {
				ex.printStackTrace(); 
			}
		}); 
		System.out.println(t1.getState()); 
		t1.start();
		System.out.println(t1.getState()); 
		t1.join(1000);
		System.out.println(t1.isAlive()); 
		System.out.println(t1.getState()); 
	}
}
