package project.banco;

public class Banco {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(0001, 1, "Tassio Lima", "CC");
		conta.abrirConta();
		conta.saque(100);
		conta.pagarMensal();
		conta.depositar(50);
		conta.fecharConta();
		conta.statusConta();
		
	}

}
