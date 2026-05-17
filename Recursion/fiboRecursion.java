import java.util.*;
class A
{
	static int fib_Recursive(int n)
	{
		if(n<2)
		{
			return n;
		}
		return fib_Recursive(n-1)+fib_Recursive(n-2);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(fib_Recursive(n));
	}
}
/* if we were to give bigger values as input, Code doesn't run.... Because of repeated fuctions again and again, So we need famous combination of (DYNAMIC PROGRAMMING + RECURSION) to avoid those repeated functions....    */ 