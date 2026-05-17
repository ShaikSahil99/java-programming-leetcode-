import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();	
		String a[]=s.split(" ");
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}		
			}
		}
		System.out.print(Arrays.toString(a));
	}
}