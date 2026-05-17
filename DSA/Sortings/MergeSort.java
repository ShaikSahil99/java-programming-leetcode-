import java.util.*;
class A
{
	public static void Merge(int left[],int right[])
	{
		int MergeArr[]=new int[left.length + right.length];
		while()
	}
	public static int[] MergeSort(int a[])
	{
		int mid=a.length/2;
		int left[]=MergeSort(Arrays.copyOfRange(a,0,mid));
		int right[]=MergeSort(Arrays.copyOfRange(a,mid,a.length));
		return Merge(left,right);
	}
	public static void main(String[]arg)
	{
		int a[]={3,2,4,8,7,9,6};
		int s=0,e=a.length-1;
		MergeSort(a);
	}
}