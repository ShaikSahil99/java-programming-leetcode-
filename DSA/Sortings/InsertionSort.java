import java.util.*;
class A
{
	static String insertionSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j-1]>a[j])
				{
					a[j-1]=a[j-1]+a[j]-(a[j]=a[j-1]);
				}	
			}
		}
		return Arrays.toString(a);
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print(insertionSort(a));
	}
}