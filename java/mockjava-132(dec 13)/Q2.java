import java.util.*;
class A
{
	static A x;
	char s='K';
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();;
		String c=sc.next();
		int arr[]={1,2,3,4};
		try{
			long l=sc.nextLong();
			int t=sc.nextInt();
			if(t==0)
			{
				System.out.println(x.s);
			}
			else if(t==1)
			{
				for(int i=0;i<=arr.length;i++)
				{
				System.out.print(arr[i]+" ");
				}
			}
			else
			{
				int k=Integer.parseInt(c);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
	
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
		}
	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
	}
}