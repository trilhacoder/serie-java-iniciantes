package agenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemplosRepeticoes {

	public static void main(String[] args) {
//		// ao invés de fazer
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		
//		// podemos fazer assim
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		List<Contato> contatos = Arrays.asList(
//				  new Contato("Maria", "1111-1111", "maria@email.com"),
//				  new Contato("Fernando", "1111-1111", "fernando@email.com"),
//				  new Contato("Luana", "1111-1111", "luana@email.com")
//				);

		// sem for
//		if (contatos.size() >= 1) {
//			System.out.println(contatos.get(0).getEmail() + " - Olá " + contatos.get(0).getNome() + ", comunicamos que não abriremos amanhã 07/09, devido ao feriado do Dia da Independência.");
//		}
//		if (contatos.size() >= 2) {
//			System.out.println(contatos.get(1).getEmail() + " - Olá " + contatos.get(1).getNome() + ", comunicamos que não abriremos amanhã 07/09, devido ao feriado do Dia da Independência.");
//		}
//		if (contatos.size() >= 3) {
//			System.out.println(contatos.get(2).getEmail() + " - Olá " + contatos.get(2).getNome() + ", comunicamos que não abriremos amanhã 07/09, devido ao feriado do Dia da Independência.");
//		}

		// com for
//		for (int i = 0; i < contatos.size(); i++) {
//			System.out.println(contatos.get(i).getEmail() + " - Olá " + contatos.get(i).getNome() + ", comunicamos que não abriremos amanhã 07/09, devido ao feriado do Dia da Independência.");
//		}
		
//		int i = 0;
//		while (i < 3) {
//			System.out.println(i);
//			i++;
//		}
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 3);
		
		

	}

}
