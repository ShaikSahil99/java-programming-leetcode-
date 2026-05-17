import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		int dc=0;
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					c++;
				}
			}
			if(c==2)
			{
				dc++;
			}
		}
		System.out.print(dc);
	}
}

/*    Array duplicates Count
import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		int a[]={1,2,3,1,2,1,2};		
		int c=0,dc=0;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			c=0;
			for(int j=i;j<n;j++)
			{
				if(a[i]==a[j])
				{
					c++;			
				}
			}
			if(c==2)
			{
				dc++;
			}
		}
		System.out.print(dc);
	}
}
*/