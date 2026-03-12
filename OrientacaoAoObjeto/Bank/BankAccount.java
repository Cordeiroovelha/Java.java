package OrientacaoAoObjeto.Bank;

public class BankAccount {
	private int id;
	private String clientName;
	private double balance;
		
	// construtor iniciado
	public BankAccount(int id, String clientName, double balance) {
		this.id = id;
		this.clientName = clientName;
		this.balance = balance;
	}

	// Construtro padrão
	public BankAccount() {
		
	}
		
	public void withDraw(double value) {
		if(value <= balance) { 
			balance -= value;
		}else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}
		
	public void deposit(double value) {
		if (value > 0) {
			balance += value;
		}
	}
		
		public void displayDetails() {
		System.out.println("Dados da conta: ");
		System.out.println("--------------------------");
		System.out.println("Codigo .: " + id);
		System.out.println("Nome ...: " + clientName);
		System.out.println("Saldo ..: R$ " + balance);
		System.out.println("--------------------------");
	}
}


