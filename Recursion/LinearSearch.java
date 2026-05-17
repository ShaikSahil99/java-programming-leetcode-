import java.util.Scanner;
class A
{
	static String LinearSearch(int a[],int k,int index)
	{
		if(index==a.length)
		{
			return "Not Found";
		}
		if(a[index]==k)
		{
			return "Found";
		}
		return LinearSearch(a,k,index+1);
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int a[]={1,2,3,4,5,6,7,8,9};
		int k=sc.nextInt();
		int index=0;
		System.out.print(LinearSearch(a,k,index));
	}
}