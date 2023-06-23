package agenda;

/* Classe representando uma conta bancária */
public class ContaBancaria { // classe
	
	public String numero;
	public double saldo;

	ContaBancaria(String numero, double saldo) { // construtor
		this.numero = numero; // propriedade
		this.saldo = saldo; // propriedade
	}

	public void depositar(double valor) { // método
		this.saldo = this.saldo + valor;
	}

	public void sacar(double valor) { // método
		this.saldo = this.saldo - valor;
	}
}