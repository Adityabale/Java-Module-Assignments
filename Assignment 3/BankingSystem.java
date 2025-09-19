package Assignment3;
import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
	private String accountName;
	private int accountNum;
	private double accountBal;
	
	BankAccount(String accountName, int accountNum, double accountBal){
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.accountBal = accountBal;
	}
	
	String getAccountName() {
		return this.accountName;
	}
	
	int getAccountNum() {
		return this.accountNum;
	}
	
	double getAccountBal() {
		return this.accountBal;
	}
	
	void setAccountBalAdd(int amt) {
		this.accountBal += amt;
	}
	
	void setAcccountBalDeduc(int amt) {
		this.accountBal -= amt;
	}
}

class BankingSystem {
	ArrayList<BankAccount> Bank = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	BankAccount addAccount() {
		System.out.println("Enter account Name: ");
		String accName = sc.nextLine();
		
		System.out.println("Enter account number: ");
		int accNum = Integer.parseInt(sc.nextLine());
		
		int accBal = 0;
		
		BankAccount ba = new BankAccount(accName, accNum, accBal);
		Bank.add(ba);
		return ba;
	}
	
	void depositMoney() {
		BankAccount ba = addAccount();
		System.out.println("Enter amount to be deposited: ");
		int amt = Integer.parseInt(sc.nextLine());
		ba.setAccountBalAdd(amt);
		return;
	}
	
	void withdrawMoney() {		
		if (Bank.isEmpty()) {
			System.out.println("No accounts in the Bank!!!");
			return;
		}
		
		System.out.println("Enter account number for withdrawal: ");
		int accNum = Integer.parseInt(sc.nextLine());
		
		for (BankAccount ba: Bank) {
			if (ba.getAccountNum() == accNum) {
				System.out.println("Enter amount to be withdrawn: ");
				int amt = Integer.parseInt(sc.nextLine());
				ba.setAcccountBalDeduc(amt);
				return;
			}
		}
		System.out.println("No account found for given account details!!!");
	}
	
	void displayBalance() {
		if (Bank.isEmpty()) {
			System.out.println("No accounts in the Bank!!!");
			return;
		}
		
		System.out.println("Enter account number details: ");
		int accNum = Integer.parseInt(sc.nextLine());
			
		for (BankAccount ba: Bank) {
			if (ba.getAccountNum() == accNum) {
				System.out.println("The account name: " + ba.getAccountName() + " account number: " + ba.getAccountNum() + " balance: " + ba.getAccountBal());
			}
		}
		System.out.println("No accounts found for given account details!!!");
	}
	
	void fundTransfer() {
		if (Bank.isEmpty()) {
			System.out.println("No accounts in the Bank!!!");
			return;
		}
		
		System.out.println("Enter your account number details: ");
		int senderNum = Integer.parseInt(sc.nextLine());
		
		for (BankAccount ba: Bank) {
			if (ba.getAccountNum() == senderNum) {
				System.out.println("Enter amount to be transfered: ");
				int amt = Integer.parseInt(sc.nextLine());
				ba.setAcccountBalDeduc(amt);
				
				System.out.println("Enter account number details of the receiver: ");
				int receiverNum = Integer.parseInt(sc.nextLine());
				
				for (BankAccount bac: Bank) {
					if (bac.getAccountNum() == receiverNum) {
						bac.setAccountBalAdd(amt);
						return;
					}
				}
			}
		}
		System.out.println("No accounts found for given account details!!!");
	}
	
	void showMenu(){
		int option;
		
		do {
			System.out.println("===Banking System===");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Display Balance");
			System.out.println("4. Transfer Money");
			System.out.println("5. Exit");
			System.out.println("Enter valid option:");
			
			option = Integer.parseInt(sc.nextLine());
			
			switch (option) {
				case 1:
					depositMoney();
					break;
				case 2:
					withdrawMoney();
					break;
				case 3:
					displayBalance();
					break;
				case 4:
					fundTransfer();
					break;
				case 5:
					System.out.println("Exiting!!!");
					return;
				default:
					System.out.println("Entered invalid option!!!")
;			}
		}while(option != 5);
	}
	
	public static void main(String args[]) {
		BankingSystem bs = new BankingSystem();
		bs.showMenu();
		
	}
}

