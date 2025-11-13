package ejercicios_hilos_java;

public class Ejercicio4 {
	
	public static int contador = 0; 
	
	public static void main (String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			try {
				for (int i = 0; i <= 5; i++) {
					System.out.println(contador++); 
					Thread.sleep(1000); 
				}
			} catch (Exception ex) {
				ex.printStackTrace(); 
			}			
		}); 
		
		System.out.println(t1.getState()); 
		t1.start();
		System.out.println(t1.getState()); 
		t1.join();
		System.out.println(t1.getState()); 	
	}
}
