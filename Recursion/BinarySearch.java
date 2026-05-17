import java.util.*;
class A
{
	static String RecursiveBinarySearch(int a[],int k,int s,int e)
	{	
		int mid=(s+e)/2;
		if(s>e)
		{
			return "Not Found";
		}
		if(a[mid]==k)
		{
			return "Found";
		}
		else if(k>a[mid])
		{
			return BinarySearchRecursive(a,k,mid+1,e);
		}
		return BinarySearchRecursive(a,k,s,mid-1);
	}
	static int[] BubbleSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
				}
			}
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
		int k=sc.nextInt();
		int s=0;int e=n-1;
		System.out.print(RecursiveBinarySearch(BubbleSort(a),k,s,e));	
	}
}





/*
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
		int k=sc.nextInt();
		int s=0;int e=n-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(k==a[mid])
			{
				System.out.println("Found");
				break;
			}
			else if(k>a[mid])
			{
				s=mid+1;
			}
			else if(k<a[mid])
			{
				e=mid-1;
			}
		}
		if(s>e)
		{
			System.out.println("NOt Found");
		}
	}
}
*/