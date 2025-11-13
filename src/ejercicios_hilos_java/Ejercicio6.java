package ejercicios_hilos_java;

public class Ejercicio6 { 
	
	public static void main(String [] args) {
		//Crea un hilo que haga sleep(3000) para simular tarea larga.
		Thread t1 = new Thread(()->{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("FIN t1");
		});
		Thread t2 = new Thread(()->{
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("FIN t2");
		
			
		});
				
		
		//En el main, tras t.start(), usa t.join(1000).
		t1.start();
		try {
			t1.join();
			t2.start();
			//Después del join con timeout, comprueba t.isAlive() para saber si terminó.
			if(t1.isAlive()) {
				System.out.println("Esta vivo");
			}else {
				System.out.println("Termino");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				//Muestra mensajes distintos según haya terminado o haya expirado el tiempo.
	}
}
