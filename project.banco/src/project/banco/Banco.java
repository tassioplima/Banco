package project.banco;

public class Banco {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(0001, 1, "Tassio Lima", "CC");
		//conta.depositar(0);
		//conta.abrirConta();
		//conta.sacar(0);
		//conta.pagarMensal();
		conta.depositar(50);
		conta.fecharConta();
		conta.statusConta();
		
	}

}
