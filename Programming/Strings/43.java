import java.util.*;

class A
{
	public static void main(String[]args)
	{
		Scanner me=new Scanner(System.in);		
		String s=me.nextLine();
		String s1="";
		int k=0;
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
			
				}
			}
			if(c==1)
			{	
				if(a[i].length()>k)
				{
					k=a[i].length();
					s1=a[i];
				}
			}
		}
		System.out.print(s1);
	}
}