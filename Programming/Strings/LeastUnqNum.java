//Write a program to print the Least Unique Numbers In A given Array?
import java.util.Scanner;

class Main
{
	public static void main(String[] args) 
	{
		Scanner me=new Scanner(System.in);
		int a[]= {1,1,2,2,5,5,8,8,2};
		boolean unique=false;
		int min=Integer.MAX_VALUE;
		outer : for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					continue outer;
				}
			}
			if(min > a[i])
			{
				min=a[i];
				unique=true;
			}
		}
		if(unique)
		{
			System.out.print(min);
		}
		else
		{
			System.out.println("No Uniques");
		}
	}
}