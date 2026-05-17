import java.util.Scanner;
class A
{
	static int sum=0;
	static int rev(int n)
	{
		if(n!=0)
		{
			sum=sum+n%10+rev(n/10);
		}
		return sum;
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(rev(n));
	}
}