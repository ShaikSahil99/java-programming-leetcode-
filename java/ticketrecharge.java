import java.util.*;
interface redbus
{
	Scanner sc=new Scanner(System.in);
	int sleeper=1900;
	int seater=1200;
	public void bookTickets(String destination, int noofseats);
}
interface airtel
{
	Scanner st=new Scanner(System.in);
	public void recharge(long mobileno);
}
class Phonepay implements redbus,airtel
{
	String Seater(String destination,int noofseats)
	{
		System.out.println("\t\t\t\t\t\t\t    Press 1 to Choose Sleeper");
		System.out.println("\t\t\t\t\t\t\t    Press 2 to Choose Seater");
		int k=sc.nextInt();
		if(k==1)
		{
			System.out.println("\t\t\t\t\t\t\t    Pay "+noofseats*sleeper+" to confirm booking");
			System.out.println("\t\t\t\t\t\t\t    Press 1 to pay");
		}
		else if(k==2)
		{
			System.out.println("\t\t\t\t\t\t\t    Pay "+noofseats*seater+" to confirm booking");
			System.out.println("\t\t\t\t\t\t\t    Press 1 to pay");
		}
		k=sc.nextInt();
		System.out.println("\t\t\t\t\t\t\t    Your Ticket for "+destination+" for "+noofseats+" passengers has been confirmed");
		return "Ticket Booked Successful";
	
	}
	String recharge()
	{
		System.out.println("\t\t\t\t\t\t\t    Available packs are :");
		System.out.println("\t\t\t\t\t\t\t    239/mon - 28 days validity & 1gb per day");
		System.out.println("\t\t\t\t\t\t\t    499/mon - 56 days validity & 1gb per day");
		System.out.println("\t\t\t\t\t\t\t    759/mon - 84 days validity & 1gb per day");
		System.out.println("\t\t\t\t\t\t\t    Press 1 to recharge for 239/mon");
		System.out.println("\t\t\t\t\t\t\t    Press 2 to recharge for 499/mon");
		System.out.println("\t\t\t\t\t\t\t    Press 3 to recharge for 759/mon");
		int k=sc.nextInt();
		if(k==1)
		{
			return "Recharge for 239 pack is Succcessful";
		}
		else if(k==2)
		{
			return "Recharge for 499 pack is Succcessful";
		}
		else
		{
			return "Recharge for 759 pack is Succcessful";
		}
		
	}
	public void bookTickets(String destination, int noofseats)
	{
		System.out.println(Seater(destination,noofseats));
		
	}
	public void recharge(long mobileno)
	{
		System.out.println(recharge());
	}
	
}
class User
{
	static Scanner sc=new Scanner(System.in);
	static User z=new User();
	void bookTicketss()
	{
		redbus x=new Phonepay();
		System.out.println("\t\t\t\t\t\t\t    Enter your Destination and no. of Seats");
		x.bookTickets(sc.next(),sc.nextInt());
		
	}
	void recharge()
	{
		airtel y=new Phonepay();
		System.out.println("\t\t\t\t\t\t\t    Enter the Mobile Number ");
		y.recharge(sc.nextLong());
	}
	public static void main(String[]arg)
	{
		User obj=new User();
		System.out.println("\t\t\t\t\t\t\t    Press 0 for TicketBooking");
		System.out.println("\t\t\t\t\t\t\t    Press 1 for Recharge");
		int n=sc.nextInt();
		if(n==0)
		{
			z.bookTicketss();
		}
		else if(n==1)
		{
			z.recharge();
		}
	}
}
