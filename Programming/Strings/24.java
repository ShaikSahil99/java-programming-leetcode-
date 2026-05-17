import java.util.*;
class A
{
	static String validPassWord(String s)
	{
		int a=0,b=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')	
			{
				a++;
			}
			else if(ch>='0'&&ch<='9')
			{
				b++;
			}
			else if(!((ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')||ch==' '))
			{
				c++;
			}
		}
		if(a>0&&b>0&&c>0)
		{
			return "Perfect";
		}	
		else
		{	
			return "Not Perfect";
		}
	}
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		if(s.length()==9)
		{
			System.out.print(validPassWord(s));
		}
		else
		{
			System.out.print("Not Perfect");
		}
	}
}