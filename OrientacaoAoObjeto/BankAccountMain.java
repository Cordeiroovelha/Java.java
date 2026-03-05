package OrientacaoAoObjeto;

public class BankAccountMain {
    public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1, "Arthur Morgan", 1000 );
		System.out.println(account1);
		account1.displayDetails();
		account1.deposit(1000);
		System.out.println("--------------------------");
	    System.out.println("Saldo atualizado: +1000");
	    System.out.println("--------------------------");
	    account1.withDraw(500);
	    System.out.println("Saldo atualizado: -500");
	    System.out.println("--------------------------");
	    account1.displayDetails();
	
	    BankAccount account2 = new BankAccount(02, "Dutch Van Der Linde", 10000);
	    account2.displayDetails();
	    account2.deposit(100);
	    System.out.println("--------------------------");
	    System.out.println("Saldo atualizado: +100");
	    System.out.println("--------------------------");
	    account1.withDraw(500);
	    System.out.println("--------------------------");
	    System.out.println("Saldo atualizado: -500 (erro)");
	    System.out.println("--------------------------");
	    account2.displayDetails();
	}
}


