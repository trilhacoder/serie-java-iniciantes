package agenda;

public class Contato {
	
	private double id;
	private String nome;
	private String celular;
	private String email;

	public Contato(String nome, String celular, String email) {
		this.id = Math.random();
		this.nome = nome;
		this.celular = celular;
		this.email = email;
	}
	
	public double getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}