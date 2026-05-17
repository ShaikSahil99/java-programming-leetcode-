import java.util.*;
class A
{
	static void fun(int n)
	{
		if(n==5)
		{
			return;
		}
		fun(n+1);
		System.out.print(n);
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fun(n);
	}
}