import java.util.Scanner;
class Company
{
	static Scanner sc=new Scanner(System.in);
 	int RAM=sc.nextInt();
	int ROM=sc.nextInt();
	String name=sc.next();
	String OS_name=sc.next();
	String OS_version=sc.next();
	String Processor=sc.next();
	int battery=sc.nextInt();
	float price=sc.nextFloat();
	
   
}
class Wholesale extends Company
{
		
	float b=price+sc.nextFloat();
}
class RetailMarket extends Wholesale
{
	float c=b+sc.nextFloat();
}
class Customer extends RetailMarket
{
	void display()
	{
		System.out.println(RAM);
		System.out.println(ROM);
		System.out.println(name);
		System.out.println(OS_name);
		System.out.println(OS_version);
		System.out.println(Processor);
		System.out.println(battery);
		System.out.println(c);
	}
	public static void main(String[]a)
	{
		Customer obj=new Customer();
		obj.display();
		
	}
}
      
      