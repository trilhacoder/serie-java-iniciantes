package agenda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ExemploCondicionais {

	public static void main(String[] args) {
		// if
//		int nota = 3;
//		boolean resultadoReprovado = nota < 5;
//		if (resultadoReprovado) {
//		  System.out.println("Reprovado");
//		}
//		
//		// if .. else
//		int nota2 = 6;
//		if (nota2 < 4) {
//		  System.out.println("Reprovado");
//		} else {
//		  System.out.println("Recuperação ou Aprovado");
//		}
		
		// if .. else if
//		int nota3 = 10;
//		if (nota3 < 4) {
//		  System.out.println("Reprovado");
//		} else if (nota3 < 5) {
//		  System.out.println("Recuperação");
//		} else {
//		  System.out.println("Aprovado");
//		}
		
		// switch
//		String alternativa = "d";
//		switch (alternativa) {
//		  case "a":
//			  System.out.println("Selecionado a alternativa a");
//			  break;
//		  case "b":
//			  System.out.println("Selecionado a alternativa b");
//			  break;
//		  case "c":
//			  System.out.println("Selecionado a alternativa c");
//			  break;
//		  default:
//			  System.out.println("Nenhuma das anteriores");
//		}
		
		int resultado = 10 + 2;
//		resultado = resultado + 1;
//		resultado++;
		resultado += 2;
		String concatenando = "Franklin" + " de Oliveira";
		
		int n1 = 1;
		int n2 = 2;
		boolean teste = n1 == n2;
		System.out.println(teste);
		
		if (teste) {
			System.out.println(n1 + " é igual a " + n2);
		} else {
			System.out.println(n1 + " é diferente de " + n2);
		}
		
		if (n1 == n2) {
			System.out.println(n1 + " é igual a " + n2);
		} else {
			System.out.println(n1 + " é diferente de " + n2);
		}
		
		if (n1 != n2) {
			System.out.println(n1 + " é diferente de " + n2);
		}
		
		if (n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
		}
		
		if (n1 < n2) {
			System.out.println(n1 + " é menor que " + n2);
		}
		
		boolean maiorDeIdade = false;
		boolean sexoMasculino = true;
		
		if (maiorDeIdade && sexoMasculino) {
			System.out.println("Deve se alistar obrigatóriamente.");
		}
		
		if (maiorDeIdade || sexoMasculino) {
			System.out.println("É maior de idade ou do sexo masculino.");
		}		
		
		System.out.println(resultado);
		System.out.println(concatenando);
		
		String estado = "são paulo";		
		if (estado instanceof String) {
			System.out.println("Variável estado é uma String.");
		}
		
		List<Contato> contatos1 = new ArrayList<>();
		List<Contato> contatos2 = new LinkedList<>();
		
		verificaInstanceOf(contatos1, contatos2);
		
		
		System.out.println("fim");

	}
	
	public static void verificaInstanceOf(List<Contato> contatos1, List<Contato> contatos2) {
		if (contatos1 instanceof ArrayList) {
			System.out.println("Instancia de ArrayList");
		}		
		if (contatos2 instanceof LinkedList) {
			System.out.println("Instancia de LinkedList");
		}
		if (contatos1 instanceof LinkedList) {
			System.out.println("Instancia de LinkedList");
		}
	}

}
