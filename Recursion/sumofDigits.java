import java.util.Scanner;
class A
{
	static long countDigits(long sum1)
	{
		long c=0;
		while(sum1!=0)
		{
			sum1=sum1/10;
			c++;
		}
		return c;
	}
	static long sumDigits(long n)
	{
		long sum=0;
		while(n!=0)
		{
			long r=n%10;
			n=n/10;
			sum=sum+r;
		}
		if(countDigits(sum)==1)
		{
			return sum;
		}
		return sumDigits(sum);
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		System.out.print(sumDigits(n));
		
		
		
		
	}	
}