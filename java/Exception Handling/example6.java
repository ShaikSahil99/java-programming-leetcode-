import java.util.Scanner;
class A
{
	static A x;
	int a=10;
    public static void main(String[]args)
    {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Hello");
		System.out.println(x.a);
		try
		{
			System.out.println(x.a);	
		}
		catch(NullPointerException e)
		{
			System.out.println("Empty Object");	 
		}
		System.out.print("End");
    }
}
      