package agenda;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("123", 0); // conta é um objeto da classe ContaBancaria
		System.out.println(conta.saldo);
		conta.depositar(100);
		conta.sacar(10);
		System.out.println(conta.saldo);
	}

}
