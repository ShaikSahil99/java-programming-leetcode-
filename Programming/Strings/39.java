 import java.util.*;

class A
{
	public static void main(String[]args)
	{
		Scanner me=new Scanner(System.in);		
		String s=me.next();
		char s1='k';
		int c=0,k=0;
		for(int i=0;i<s.length();i++)
		{
			c=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					c++;
				}
			}
			if(c>k)
			{
				k=c;
				s1=ch;
			}
		}
		System.out.print(s1);
	}
}