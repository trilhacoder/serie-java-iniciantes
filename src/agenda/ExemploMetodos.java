package agenda;

public class ExemploMetodos {

	public static void main(String[] args) {
		int resultadoSoma = somar(3, 5); // executando o método
		System.out.println("Resultado da soma: " + resultadoSoma); // imprimindo o resultado
		
		int resultadoSubtracao = subtrair(5, 3); // executando o método
		System.out.println("Resultado da subtracao: " + resultadoSubtracao); // imprimindo o resultado
	}

	public static int somar(int numero1, int numero2) { // entrada
		int resultado = numero1 + numero2; // processamento
		return resultado; // saída
	}
	
	public static int subtrair(int numero1, int numero2) { // entrada
		int resultado = numero1 - numero2; // processamento
		return resultado; // saída
	}
}