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

	public Conta(int conta, int agencia, String dono, String tipo, boolean status) {
		super();
		this.setConta(conta); 
		this.setAgencia(agencia);
		this.setDono(dono);
		this.setTipo(tipo);
		this.setStatus(status);
		
	}

	// Métodos

	public void abriConta() {

		this.status = true;
		
		if (status == true && tipo.equals("CC")) {
			
			depositar(50);
			
		}else if (status == true && tipo.equals("CP")) {
			
			depositar(150);
		}

	}

	public void fecharConta() {

		this.status = false;
		

	}

	public void depositar(int depositar) {
		
		this.saldo += depositar;

	}

	public void sacar(int sacar) {
		
		this.saldo -= sacar;
		
		if (saldo < 0){
			
			System.out.println("Você não pode sacar mais dinheiro está "+ this.getSaldo() + " negativo");
		} else if (saldo == 0){
			
			System.out.println("Você está sem saldo.");
			
		}else{
			System.out.println("Você pode sacar dinheiro tem "+ this.getSaldo() + " positivo");
			
		}
		

	}

	public void pagarMensal() {
		
		
		
		if (tipo.equals("CC")){
			
			this.saldo -= 12;
			
		}else if (tipo.equals("CP")){
			
			this.saldo -= 20;
			
		}
		
		

	}
	
	public void statusConta(){
		
		System.out.println("Conta: " + this.getConta());
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Status: " + this.isStatus());
		
	}

}
