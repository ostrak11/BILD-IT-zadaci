package zadaci_20_08_2016;
import java.util.Date;

/*   Design a class named Account that contains:
 	■ A private int data field named id for the account (default 0).
 *  ■ A private double data field named balance for the account (default 0).
 *  ■ A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume all accounts have the same interest rate. 
 *  ■ A private Date data field named dateCreated that stores the date when the account was created. 
 *  ■ A no-arg constructor that creates a default account. 
 *  ■ A constructor that creates an account with the specified id and initial balance. 
 *  ■ The accessor and mutator methods for id,balance, and annualInterestRate. 
 *  ■ The accessor method for dateCreated. 
 *  ■ A method named getMonthlyInterestRate() that returns the monthly interest rate. 
 *  ■ A method named getMonthlyInterest() that returns the monthly interest. 
 *  ■ A method named withdraw that withdraws a specified amount from the account. 
 *  ■ A method named deposit that deposits a specified amount to the account. 
 *  Draw the UML diagram for the class and then implement the class. (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
 *   Monthly interest is balance*monthlyInterestRate.monthlyInterestRate is annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g., like 4.5%. 
 *   You need to divide it by 100.) Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest 
 *   rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the date
 *    when this account was created. */

public class Zad4_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kreiranje objekta
		Account racun= new Account();
		Account user= new Account(1122,20000);
		
		//pozivanje metoda na objekat
		user.setAnnualInterestRate(4.5);
		user.withdraw(2500);
		user.deposit(3000);
		
		//ispis rezultata
		System.out.println("Stanje racuna je: "+user.getBalance());
		System.out.println("Mjesecni prohod je: "+user.getMonthlyInterest());
		System.out.println("Datum kreiranja racuna je: "+user.getDateCreated());
		
	}

}
 class Account {

	 //kreiranje varijablei
	private int ID;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//kreiranje konstruktora
	Account(){
		ID=0;
		balance=0;
		annualInterestRate=0;
	};
	
	public Account(int iD, double balance) {
		ID = iD;
		this.balance = balance;
	}

	//geteri i setteri za varijable
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//metoda koja vraca datum
	public Date getDateCreated() {
		
			Date date= new Date(System.currentTimeMillis());
		return date;
	}
	
	//metoda za mjesecnu kamatnu stopu
	double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	//iznos kamate
	double getMonthlyInterest(){
		return balance*(getMonthlyInterestRate()/100);
	}
	
	//metoda za povlačenje novca
	void withdraw(double Cash){
		balance=balance-Cash;
	}
	
	//metoda za deponovanje novca
	void deposit(double Cash){
		balance=balance+Cash;
	}
}
