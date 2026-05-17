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
        for(int i=0;i<n;i++)
        {
        	int fc=0;
		for(int j=1;j<=a[i];j++)
		{
			if(a[i]%j==0)
			{
				fc++;
			}
		}
		if(fc==2)
		{
			c++;
			sum=sum+a[i];
		}
        }
	System.out.print((float)(sum/c));
    }
}