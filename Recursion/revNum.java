import java.util.Scanner;
class A
{
	static int sum=0;
	static int rev(int n)
	{
		if(n==0)
		{
			return sum;
		}
		int r=n%10;
		sum=sum*10+r;
		return rev(n/10);
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(rev(n));
	}
}