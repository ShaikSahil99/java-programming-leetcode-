import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.next(); String s1="";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			
				char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z' || ch>='a'&& ch<='z')
			{
				c++;
				if(c%2==1)
				{
					if(ch>='A'&& ch<='Z')
					{	
						s1=s1+(char)(ch+32);
					}
					else if(ch>='a'&&ch<='z')
					{
						s1=s1+(char)(ch-32);
					}
				}
				else
				{
					s1=s1+ch;
				}
			}
			
		}
		System.out.print(s1);
	}
}
