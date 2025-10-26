package ejercicios_hilos_java;

public class LanzadorHilosNRunnable {
	
	public static void main (String[] args) throws InterruptedException {
		Thread h = new Thread(new Hilo("a")); 
		h.start();
		try {
			System.out.println(h.getName() + " ---> " + h.getState());
			Thread.sleep(10);		
		} catch (Exception ex) {
			ex.printStackTrace();
		}		 
	}
}
