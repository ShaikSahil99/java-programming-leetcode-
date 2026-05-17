import java.util.Scanner;
import java.util.ArrayList;
class A
{
	static ArrayList<Integer> BinarySearch(int a[],int k,int s,int e,ArrayList<Integer> list)
	{
		int mid=(s+e)/2;
		if(a[mid]==k)
		{
			list.add(mid);
		}
		if(s>e)
		{
			return list;
		}
		if(k>a[mid])
		{
			
			return BinarySearch(a,k,mid+1,e,list);
		}
		
		return BinarySearch(a,k,s,mid-1,list);
	}
	public static void main(String[]arg)
	{	
		Scanner sc=new Scanner(System.in);
		int a[]={1,2,3,4,4,4,7,8,9};
		int s=0,e=a.length-1;
		int k=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		System.out.print(BinarySearch(a,k,s,e,list));
	}
}