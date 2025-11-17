import java.util.Scanner;
class Atm
{
	long availableBalance;
	static Atm transaction=new Atm();
	static Scanner sc=new Scanner(System.in);
	int checkBalance(int atmpin)
        {
 		availableBalance=sc.nextLong();
		System.out.print("Available Balance: ");
		System.out.println(availableBalance);
		return sc.nextInt();
		
        }
        String withdrawl(int atmpin,long withdrawnAmount)
        {
		
		long remainingBalance=availableBalance-withdrawnAmount;
		System.out.print("Remaining Balance: ");
		System.out.println(remainingBalance);
		return sc.next();
	}
        String deposit(long accountNo,long mobileNo,long depositAmount,int atmpin)
 	{
		
		long updatedBalance=availableBalance+depositAmount;
		System.out.print("Updated Balance: ");
		System.out.println(updatedBalance);
		return sc.next();
	}
        public static void main(String[]args)
        {
		System.out.println("Type C to CHECK BALANCE");
		System.out.println("Type W to WITHDRAW AMOUNT");
		System.out.println("Type D to DEPOSIT");
		char c=sc.next().charAt(0);
		if(c=='C')
		{
			transaction.checkBalance(sc.nextInt());
		}
		else if(c=='W')
		{
			System.out.println(transaction.withdrawl(transaction.checkBalance(sc.nextInt()),sc.nextLong()));
		}
		else if(c=='D')
		{
			System.out.println(transaction.deposit(sc.nextLong(),sc.nextLong(),sc.nextLong(),transaction.checkBalance(sc.nextInt())));
		}
        }
}
      
      