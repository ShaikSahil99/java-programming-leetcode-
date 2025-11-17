import java.util.Scanner;
class A
{
    public static void main(String[]args)
    {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Hello");
		try
		{
			System.out.print(10/0);
			throw new ArithmeticException();
		}
		catch(Exception e)
		{
			System.out.print("Handled");
		}
			 
		
    }
}
      