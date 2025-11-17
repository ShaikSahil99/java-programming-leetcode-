import java.util.Scanner;
class A
{	
	static int c,d=0;
	static Scanner sc=new Scanner(System.in);
	static int m1(int a)
	{
			c=a;
			while(a!=0)
			{
				a=a/10;
				d++;
			}
			
			return  d;
	}
}
class B extends A
{	static int sum=0;
	static int r;
	static int m2(int b,int c)
	{
			while(b!=0)
			{
				r=b%10;
				b=b/10;
				sum=sum+(int)Math.pow(r,c);
			}
			return sum;
	}
}
class C extends B
{
	static int a=sc.nextInt();
	static String m3()
	{
		int k=m2(a,m1(a));
		if(a==k)
		{
			return "Palindrome";
		}
		else
		{
			return "Not a Palindrome";	
		}
	}
	public static void main(String[]args)
	{
		System.out.print(m3());
	}
}