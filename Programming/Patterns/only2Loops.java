import java.util.*;              
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		for(int i=1;i<=2*n;i++)
		{
			if(i<=n)
			{
				k++;
			}
			else
			{
				k--;	
			}
			for(int j=1;j<=k;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}	