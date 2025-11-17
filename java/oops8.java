import java.util.Scanner;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	static String IFSC=sc.next();
	String name=sc.next();
	String acntnumber=sc.next();
	long balance=sc.nextInt();
	long mobilenumber =sc.nextLong();
	String loccation=sc.next();
}
class phonepay extends Bank
{
	
		void bustickets(int seats,int price)
		{
			long a=(long)seats*price;
			long b=balance-a;
			System.out.println("Ticket Booking Successful");
		}
		void ElectricityBill(int bill,long BillNo)
		{
			long b=(long)balance-bill;
			System.out.println("Bill Paid Successfully");
		}
	
		long BalanceCheck()
		{
			System.out.println("Available Balance : ");
			return balance;
		}
}
class user1 extends phonepay
{
	int i=sc.nextInt();	
}
class user2 extends phonepay
{
	int j=sc.nextInt();
}
class user3 extends phonepay
{
	int k=sc.nextInt();
}
class Test extends Bank
{
	public static void main(String[]ar)
	{
		user1 obj=new user1();
		if(obj.i==0)
		{
			obj.bustickets(sc.nextInt(),sc.nextInt());
		}
		else if(obj.i==1)
		{
			obj.ElectricityBill(sc.nextInt(),sc.nextLong());
		}
		else if(obj.i==2)
		{
			System.out.print(obj.BalanceCheck());
		}
		user2 obj1=new user2();
		if(obj1.j==0)
		{
			obj1.bustickets(sc.nextInt(),sc.nextInt());
		}
		else if(obj1.j==1)
		{
			obj1.ElectricityBill(sc.nextInt(),sc.nextLong());
		}
		else if(obj1.j==2)
		{
			System.out.print(obj1.BalanceCheck());
		}
		user3 obj2=new user3();
		if(obj2.k==0)
		{
			obj.bustickets(sc.nextInt(),sc.nextInt());
		}
		else if(obj2.k==1)
		{
			obj.ElectricityBill(sc.nextInt(),sc.nextLong());
		}
		else if(obj2.k==2)
		{
			System.out.print(obj.BalanceCheck());
		}
	}
}
