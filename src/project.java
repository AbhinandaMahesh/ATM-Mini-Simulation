import java.util.*;
public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int balance = 5000;
		int amount; 
		
		System.out.println("1. Check Balance");
		System.out.println("2. Deposite");
		System.out.println("3. Withdraw");
		
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Balance: "+ balance);
			break;
		
		case 2:
			System.out.println("Enter amount to Deposit");
			amount = sc.nextInt();
			balance = balance + amount;
			System.out.println("New Balance" + balance);
			break;
		
		case 3:
			System.out.println("Enter smount to withdraw");
			amount = sc.nextInt();
			if(amount <= balance) {
				balance = balance - amount;
				System.out.println("Updated Balance: "+balance);
			}else {
				System.out.println("Insufficent balance");
			}
			break;
			default:
				System.out.println("Invalid Choice");
		}
		sc.close();
		
		
		
	}

}
