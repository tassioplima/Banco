package project.banco;

public class Banco {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(00001, 012, "Tassio Lima", "CC", true);
		conta.depositar(150);
		conta.abriConta();
		conta.sacar(0);
		conta.statusConta();
		
		
	}

}
