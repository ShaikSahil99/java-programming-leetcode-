import java.util.*;

class A
{
	public static void main(String[]args)
	{
		Scanner me=new Scanner(System.in);		
		String s=me.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					c++;
				}
			}
			System.out.println(a[i]+"-->"+c);
		}
	}
}