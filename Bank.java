
import.java.laong.String;
class BankAccount {
	long num;
	String name;
	double balance;
	public void Deposit(Double amt) {
		balance = balance + amt;
}

	Double withdraw(Double amt) {
		balance = balance - amt;
		return amt;
}

	void currentBalance() {
		System.out.println(balance);

}

	void Display() {
		System.out.println("num\t:" + num);
		System.out.println("name\t:" + name);
		System.out.println("balance\t;" + balance);
}

	public void deposit(int i) {
		// TODO Auto-generated method stub

}

class Bank {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		acc1.num = 101;
		acc1.name = "Raj";
		acc1.balance =13000d;

		acc2.num = 103;
		acc2.name = "Ram";
		acc2.balance =1300d;
		System.out.println("acc1 and acc2 object created intialized");
		acc1.Display();
		acc2.Display();

		acc1.deposit(2000);
		System.out.println("\n cash 2000 is deposited");
		System.out.println("current balance is");
		acc1.currentBalance();
		Double cash = acc1.withdraw((double) 3000);
		System.out.println("\n" + cash + "deducted from your account");
		System.out.println("take your cash:" + cash);
		System.out.println("current balance");
		acc1.currentBalance();
		System.out.println("\nacc1 details update");
		acc1.Display();
		System.out.println("\nacc2 details update");
		acc2.Display();
	}
}
}