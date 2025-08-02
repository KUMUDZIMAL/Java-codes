import java.util.*;
class Details {
	int customerID;
	double balance;
	String name;
	Details () {
		customerID=0;
		balance=0;
		name="";
	} Details (int c, double b, String n) {
		customerID=c;
		balance=b;
		name=n;
	} public void display() {
		System.out.println("customerID : "+customerID+", name = "+name+", balance = "+balance);
	} public void read () {
			Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter customer ID");
		customerID=sc.nextInt();
		System.out.println("Enter balance");
		balance=sc.nextDouble();
} } class BankAcc {
	public static void main (String args[]) {
		Details u1 = new Details();
		Details u2 = new Details(5987,200000.0,"KUMUD");
		u1.read();
		u1.display();
		u2.display();
} }
S