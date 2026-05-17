import java.util.*;
class A
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	int alt=0,c=0,sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    	for(int i=n-2;i>=0;i--)
	{
		int j;
		for(j=i+1;j<n;j++)
		{
			if(a[i]<a[j])
			{
				break;
			}
		}
		if(j==n)
		{
			System.out.print(a[i]+"  ");
		}
	}
}
}