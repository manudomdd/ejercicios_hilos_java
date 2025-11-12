package ejercicios_hilos_java;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinArgumentos s1 = () -> System.out.println("Sin argumentos 1"); 
		SinArgumentos s2 = () -> System.out.println("Sin argumentos 2"); 
		s1.ejecutar();
		s2.ejecutar();
		
		ConArgumentos s3 = a -> System.out.println("esto es " + a); 
		s3.imprimir("hola mundo");
		
		DosArgumentos suma = (x, y) -> x + y; 
		DosArgumentos resto = (x, y) -> x - y; 
		DosArgumentos multi = (x, y) -> x * y;
		
		
				
				
	}

}
