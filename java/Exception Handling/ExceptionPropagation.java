/*    Exception Propagation : When an exception is thrown from top of the stack and if it's not caught, it drop down the call stack to the previous method call and this process continues till it gets caught.This is called as ExceptionPropagation-------------------------------------------------------------------------*/

import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void m1()
	{
		System.out.println("I will get executed and give ip");
		int a=sc.nextInt();
		if(a==0)
		{
			System.out.println(10/0);
		}
		else
		{
			int k=Integer.parseInt("hii");	
		}
		System.out.println("I will not get executed bcoz of ExceptionPropagation");

	}
	public static void main(String[]arg)
	{
		try
		{
			m1();
		}
		catch(ArithmeticException | NumberFormatException e)
		{
			System.out.println("Handled");
		}
	}
}