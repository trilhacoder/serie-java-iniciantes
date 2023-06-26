package agenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemplosVariaveis {
	
	public static void main(String[] args) {
		
		// primitivo
		int idade = 12;
		
		// não primitivo
		Integer idade2 = 12;
		String nome = "Maria da Silva";
		System.out.println(nome.length());
		
		// array
		int[] sorteio = {5, 9, 3, 25, 78};
		System.out.println(sorteio[4]);
		System.out.println(sorteio.length);
		
		// class
		Agenda agenda = new Agenda("Franklin", "11 91111-11111");
		
//		List<Integer> sorteioList = Arrays.asList(5, 9, 3, 25, 78);
		List<Integer> sorteioList = new ArrayList<>();
		sorteioList.add(5);
		sorteioList.add(9);
		sorteioList.add(3);
		sorteioList.add(25);
		sorteioList.add(78);
		sorteioList.add(32);
		System.out.println(sorteioList.size());
		System.out.println(sorteioList.get(5));
		
		// Exempllos
		/* Declarando as variáveis */
		boolean ehCasado = true; // boolean
		String sexo = null; // null
		int idade3 = 15; // número inteiro
		String nome2 = "Maria"; // string
		String[] frutas = {"abacaxi", "morango", "pera"};
		Pessoa pessoa = new Pessoa("Maria", 24);
		List<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("verde");
		System.out.println(cores.get(0));
		
		System.out.println(Math.random());
		
	}

}
