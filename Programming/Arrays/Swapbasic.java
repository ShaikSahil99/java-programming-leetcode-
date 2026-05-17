import java.util.Scanner;
class Main
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp,i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		i=0;
		for(i=0;i<n-1;i=i+2)
		{
		
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}