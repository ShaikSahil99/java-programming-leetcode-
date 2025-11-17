import java.util.Scanner;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	static String IFSC=sc.next();
	String name=sc.next();
	String acntnumber=sc.next();
	long balance=sc.nextInt();
	long mobilenumber =sc.nextlong();
	String loccation=sc.next();
}
class phonepay extends Bank
{
	void m1()
	{
		int j=sc.nextInt();
		if(j==0)
		{
			String recharge(long number,int b)
			{
				int t=balance-b;
				return "Recharge Successful";
			}
		}
		else if(j==1)
		{
			void balancecheck(int a)
			{
				return balance;
			}
		}
		else if(j==2)
		{
			String transfer(long a)
			{
				int t=balance-a;
				System.out.print("Successfully Transfered");
				System.out.print("Available balance: ");
				return t;
			}
		}
	}
]
class Gpay extends Bank
{
	void m2()
	{
		int j=sc.nextInt();
		if(j==0)
		{
			String recharge(long a,int b)
			{
				int t=balance-b;
				return "Recharge Successful";
			}
		}
		else if(j==1)
		{
			void balancecheck(int a)
			{
				return balance;
			}
		}
		else if(j==2)
		{
			String transfer(long a)
			{
				int t=balance-a;
				System.out.print("Successfully Transfered");
				System.out.print("Available balance: ");
				return t;
			}
		}
	}
}
class paytm extends Bank
{
	void m3()
	{
		int j=sc.nextInt();
		if(j==0)
		{
			String recharge(long a,int b)
			{
				int t=balance-b;
				return "Recharge Successful";
			}
		}
		else if(j==1)
		{
			void balancecheck(int a)
			{
				return balance;
			}
		}
		else if(j==2)
		{
			String transfer(long a)
			{
				int t=balance-a;
				System.out.print("Successfully Transfered");
				System.out.print("Available balance: ");
				return t;
			}
		}
	}
}
class Test
{

	public static void main(String[]a)
	{
		int k=sc.nextInt();
		if(k==0)
		{
			Phonepay obj=new Phonepay();
		}
		else if(k==1)
		{
			Gpay obj=new Gpay();
		}
		else if(k==2)
		{
			Paytm obj=new Paytm();
		}
	}
}
       