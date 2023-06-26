package agenda;

public class ExemploStatic {
	
	private static final double PI = 3.14;
	private static int contador = 0;
	
	public void incrementar() {
		contador += 1;
	}
	
	public int getContador() {
		return contador;
	}
	
	public static void formatarSaida() {
		System.out.println("===========");
		System.out.println(contador);
		System.out.println("===========");
	}

}
