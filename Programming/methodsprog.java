import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	static int y=0;
	public static void main(String[]Sahil)
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==2)
		{
			System.out.print(m1(b));
		}
		else if(a==1)
		{
			System.out.print(m2(b));
		}
		else
		{
			if(a==m5(a))
			{
				System.out.print(m3(b));
			}
			else
			{
				System.out.print(m4(b));
			}
		}
	}
	static String m1(int b)
	{
		int fc=0;
		int k=(int)Math.sqrt(b);
		for(int i=2;i<=k;i++)
		{
			if(b%i==0)
			{
				fc++;
			}
		}
		if(fc==0)
		{
				return "Prime";
		}
		else
		{
				return "Not a Prime";
		}
	}
	static String m2(int b)
	{
		int t=b;
		int rev=0;
		while(b!=0)
		{
			int r=b%10;
			b=b/10;
			rev=rev*10+r;
		}
		b=t;
		if(rev==b)
		{
			return "Palindrome";
		}
		else
		{
			return "Not a Palindrome";	
		}
	}
	static String m3(int b)
	{
		int c=0,sum=0;
		int d=b;
		int rev2=0;
		while(b!=0)
		{
			b=b/10;
			c++;
		}
		b=d;
		while(b!=0)
		{
			int r1=b%10;
			b=b/10;
			sum=sum+(int)Math.pow(r1,c);
		}
		b=d;
		if(sum==b)
		{
			return "ArmStrong";
		}
		else
		{
			return "Not a Armstrong";	
		}
	}
	static int m4(int b)
	{
		int rev1=0;
		while(b!=0)
		{
			int n=b%10;
			b=b/10;
			rev1=rev1*10+n;
		}
		return rev1;
	}
	static int m5(int a)
	{
		int m=0;
		int fc1=0;
		int j;
		for(j=3;j>0;j++)
		{
			fc1=0;
			if(j%2!=0)
			{
				int p=(int)Math.sqrt(j);
				for(int f=2;f<=p;f++)
				{
					if(j%f==0)
					{
						fc1++;
					}
				}
				if(fc1==0)
				{
						if(j==a)
						{
							y=j;
							break;
						}
				}
			}
		}
		return y;
	}
}