import java.util.Scanner;
class Bank
{
	  static Scanner sc=new Scanner(System.in);
	long acnt_no=sc.nextLong();
	static String IFSCcode=sc.next();
	int atmPin=sc.nextInt();
	double availableBalance=sc.nextDouble();
  

     
}
class Customer extends Bank
{
	void display()
	{
		System.out.println("Account no. is:  "+acnt_no);
		System.out.println("IFSC code is:  "+IFSCcode);
		System.out.println("ATM PIN is:  "+atmPin);
		System.out.println("Available Balance is:  "+availableBalance);
	}
	public static void main(String[]a)
	{
		new Customer().display();
		new Customer().display();
		new Customer().display();
	}
}
      
      