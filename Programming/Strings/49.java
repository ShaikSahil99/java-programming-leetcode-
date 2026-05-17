import java.util.Scanner;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();	
		int k=sc.nextInt();
		String a[]=s.split(" ");
		int n=a.length;
		for(int i=0;i<n;i++)
		{		
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(a[i].equals(a[j]))
				{
					c++;
				}
			}
			if(c==k)
			{
				int j;
				for(j=i-1;j>=0;j--)
				{
					if(a[i].equals(a[j]))
					{
						break;
					}
				}
				if(j==-1)
				{
					System.out.print(a[i]+"  ");
				}
			}
		}
	}
}