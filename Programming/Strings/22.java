import java.util.*;
class A
{
	static String validPAN(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==3)
			{
				if(!(ch=='P'||ch=='F'||ch=='A'||ch=='H'||ch=='T'))
				{
					c++;
				}
			}
			else if(i==5||i==6||i==7||i==8)
			{
				if(!(ch>='0'&&ch<='9'))
				{
					c++;
				}
			}
			else if(i==0||i==1||i==2||i==4||i==9)
			{
				if(!(ch>='A'&&ch<='Z'))
				{
					c++;
				}
			}
		}
		if(c==0)
		{
			return "Valid";
		}
		else
		{
			return "Invalid";
		}
	}
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		System.out.print(validPAN(s));
	}
}