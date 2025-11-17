import java.util.Scanner;
class A
{
    public static void main(String[]args)
    {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Hello");
		try
		{
			Thread.sleep(1000);
			System.out.print(1);
			System.out.println();
			Thread.sleep(2000);
			System.out.print("bye"); 
		}
		catch(InterruptedException obj)
		{
			System.out.println(obj);
			System.out.println("Po ra");	
		}
			 
		
    }
}
   