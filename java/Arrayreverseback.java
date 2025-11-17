import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print(a[n-1]+" ");
		for(int i=n-2;i>=0;i--)
		{
			int j;
			for(j=i+1;j<n;j++)
			{
				if(a[i] < a[j])
				{
					break;
				}
			}
			if(j==n)
			{
				System.out.print(a[i]+" ");
			}
			
		}
	}
}