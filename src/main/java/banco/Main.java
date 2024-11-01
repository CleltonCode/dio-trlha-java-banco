package banco;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Clelton");
		Conta contaCorrente = new ContaCorrente(cliente);
		Conta contaPoupanca = new ContaPoupanca(cliente);
		
		contaCorrente.depositar(100);
		contaCorrente.transferir(10, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
