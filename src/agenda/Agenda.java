package agenda;

public class Agenda {

	public String nomeProprietario;
	public String telefoneProprietario;
	// maria,11 9-1111-1111,maria@email.com/carlos,11 9-1111-1111,carlos@email.com
	public String contatos;
	
	public Agenda(String nomeProprietario, String telefoneProprietario) {
		this.nomeProprietario = nomeProprietario;
		this.telefoneProprietario = telefoneProprietario;
		this.contatos = "";
	}

	public void cadastrarContato(String nome, String telefone, String email) {
		String contato = nome + "," + telefone + "," + email;
		contatos = contatos + "/" + contato;
	}

	public String listarContatos() {
		return contatos;
	}

	public void editarContato(String nome) {
		// implementar lógica ...
	}

	public void excluirContato(String nome) {
		// implementar lógica ...
	}
	
}