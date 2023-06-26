package agenda;

import agenda.modificadores.ModificadoresDeAcesso;
import agenda.modificadores.Contantes;

public class ModificadoresMain {

	public static void main(String[] args) {
		ModificadoresDeAcesso m = new ModificadoresDeAcesso();
		String nome = m.getNome();
		m.setNome("franklin");
		
		ExemploStatic es = new ExemploStatic();
		System.out.println(es.getContador());
		es.incrementar();
		es.incrementar();
		System.out.println(es.getContador());
		
		ExemploStatic es2 = new ExemploStatic();
		System.out.println(es2.getContador());
		es2.incrementar();
		es2.incrementar();
		es2.incrementar();
		System.out.println(es2.getContador());
		
		System.out.println(Contantes.c2);

	}

}
