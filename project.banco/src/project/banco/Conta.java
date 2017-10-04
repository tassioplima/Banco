package project.banco;

public class Conta {

	public int conta;
	public int agencia;
	private String dono;
	protected String tipo;
	private boolean status;
	private int saldo;

	// Getters e Setters

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// Constructor

	public Conta(int conta, int agencia, String dono, String tipo) {
		super();
		setConta(conta);
		setAgencia(agencia);
		setDono(dono);
		setTipo(tipo);
		setStatus(false);

	}

	// Métodos

	public void abrirConta() {
		setStatus(true);
		if (status == true && tipo.equals("CC")) {
			setSaldo(50);
			// depositar(50);
		} else if (status == true && tipo.equals("CP")) {
			setSaldo(150);
			// depositar(150);
		}
	}

	public void fecharConta() {
		
		if (saldo == 0) {
			setStatus(false);
			System.out.println("Conta fechada");

		} else if (saldo < 0 ) {
			System.out.println("Conta em Débito");

		}else if (saldo > 1){
			System.out.println("Conta com valor " + getSaldo() + " favor realizar o saque");
			
		}

	}

	public void depositar(int depositar) {

		if (status == true){
			this.saldo += depositar;
		}else if (status == false){
			System.out.println("Conta deve estar aberta para depositar.");
		}
		

	}

	public void saque(int sacar) {

		if (status == true && saldo < 0) {
			System.out.println("Você não pode sacar mais dinheiro está " + this.getSaldo() + " reais negativo");
		} else if (status == true && saldo == 0) {
			System.out.println("Você está sem saldo.");
		} else {
			System.out.println("Você pode sacar a quantidade de " + this.getSaldo() + " reais.");
			this.saldo -= sacar;
		}

	}

	public void pagarMensal() {

		if (tipo.equals("CC")) {

			this.saldo -= 12;

		} else if (tipo.equals("CP")) {

			this.saldo -= 20;

		}

	}

	public void statusConta() {

		System.out.println("Conta: " + this.getConta());
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Status: " + this.isStatus());

	}

}
