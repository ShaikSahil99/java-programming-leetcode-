import java.util.Scanner;
class B
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
    	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Division of a and b:");
	try
	{
		System.out.print(a/b);
	}
	catch(ArithmeticException obj)
	{
		System.out.println(b/a);
	}
	finally
	{
		System.out.println("HIIII");
	}

	
    }
}
      
      