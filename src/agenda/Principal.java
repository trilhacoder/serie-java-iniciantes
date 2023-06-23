package agenda;

import java.util.Scanner;

public class Principal {
	
	static Agenda agenda;

	public static void main(String[] args) {
		System.out.println("Bem vindo a Agenda de Contatos!");
		System.out.println("");
		System.out.println("1. Cadastrar Contato");
		System.out.println("2. Listar Contatos");
		System.out.println("3. Editar Contato");
		System.out.println("4. Excluir Contato");
		System.out.println("9. Sair");
		System.out.println("");
		
		agenda = new Agenda("Franklin", "11 91111-11111");
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Digite uma opção: ");
			
			String opcao = scanner.next();

			System.out.println("Opção escolhida: " + opcao);

			if (opcao.equals("1")) {
				cadastrarContato();
			}
			if (opcao.equals("2")) {
				listarContatos();    
			}
			if (opcao.equals("3")) {
				editarContato();
			}
			if (opcao.equals("4")) {
				excluirContato();
			}
			if (opcao.equals("9")) {
				System.out.println("Saindo do programa Agenda ...");
				break;
			}

		}
		scanner.close();
		
	}
	
	public static void cadastrarContato() {
		System.out.println("Cadastrando contato ...");
		agenda.cadastrarContato("Maria", "1111-1111", "maria@email.com");
	}

	public static void listarContatos() {
		System.out.println("Listando contatos ...");		
		String contatos = agenda.listarContatos();
		System.out.println(contatos);
	}

	public static void editarContato() {
		System.out.println("Editando contato ...");
	}

	public static void excluirContato() {
		System.out.println("Excluindo contato ...");
	}

}
