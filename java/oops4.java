import java.util.Scanner;
class Kritunga
{
	static Scanner sc=new Scanner(System.in);
	int CBiriyani(int n)
	{
		int ChickenBiriyani=250;
		return ChickenBiriyani*n;
	}
	int MBiriyani(int k)
	{
 		int MuttonBiriyani=350;
		
		return MuttonBiriyani*k;
	}
}
class Swiggy extends Kritunga
{
	int m;
	void Order(int a)
	{
		if(a==0)
		{
		m=CBiriyani(sc.nextInt());
		}
		else if(a==1)
		{
		m=MBiriyani(sc.nextInt());
		}
	}
	int Bill(int d,int i)
	{
		if(i>=1000)
		{
			System.out.print("Price with Discount included:  ");
			return i-d;
		}
		else
		{
			return i;
		}
	}
	
}
class Customer extends Swiggy
{
	public static void main(String[]a)
	{
		Customer obj=new Customer();
		obj.Order(sc.nextInt());
		System.out.print(obj.Bill(sc.nextInt(),obj.m));
		
	}
}
      
      