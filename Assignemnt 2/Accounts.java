class BankAccount {
	private int accountNo;
	private double balance;
	BankAccount(int accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	void setAccountNo(int newAccountNo) {
		this.accountNo = newAccountNo;
	}
	void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	int getAccountNo() {
		return this.accountNo;
	}
	double getBalance() {
		return this.balance;
	}
}
class Accounts{
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(1005102289, 150000);
		ba.setAccountNo(1005102290);
		ba.setBalance(140000);
		System.out.println("Account: " + ba.getAccountNo() + " balance: " + ba.getBalance());
	}
}
