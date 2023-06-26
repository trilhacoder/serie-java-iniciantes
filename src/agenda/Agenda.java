package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String nomeProprietario;
	private String telefoneProprietario;
	// maria,11 9-1111-1111,maria@email.com/carlos,11 9-1111-1111,carlos@email.com
	private List<Contato> contatos;
	
	public Agenda(String nomeProprietario, String telefoneProprietario) {
		this.nomeProprietario = nomeProprietario;
		this.telefoneProprietario = telefoneProprietario;
		this.contatos = new ArrayList<>();
	}

	public void cadastrarContato(String nome, String telefone, String email) {
		contatos.add(new Contato(nome, telefone, email));
	}

	public List<Contato> listarContatos() {
		return contatos;
	}

	public void editarContato(String nome) {
		// implementar lógica ...
	}

	public void excluirContato(String nome) {
		// implementar lógica ...
	}
	
}