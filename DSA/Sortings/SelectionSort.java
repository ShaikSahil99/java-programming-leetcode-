import java.util.*;
class A
{
	static int[] SelectionSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			int maxIndex=0;
			for(int j=1;j<=a.length-i;j++)
			{
				if(a[j]>a[maxIndex])
				{
					maxIndex=j;
				}
			}
			a[maxIndex]=a[maxIndex]+a[a.length-i]-(a[a.length-i]=a[maxIndex]);
		}	
		return a;
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
		SelectionSort(a);
		System.out.print(Arrays.toString(a));
	}
}