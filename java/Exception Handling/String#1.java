/*     Using ExceptionHandling
import java.util.*;
class A
{
	static int sumNumber(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(!((s.charAt(i)>='0'&&s.charAt(i)<='9')||(s.charAt(i)=='-')))
			{
				s=s.replace(s.charAt(i)+""," ");
			}
		}
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			try
			{
				int k=Integer.parseInt(a[i]);
				sum=sum+k;
			}
			catch(NumberFormatException e){}
		}
		return sum;
	}
	public static void main(String[]arg)
	{
		String s="hibro132byebro67goodbyebro-132";
		System.out.println(sumNumber(s));
	}
}







*/
import java.util.*;
class A
{
	static int sumNumber(String s)
	{
		int k=1,sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				if(i>0 && s.charAt(i-1)=='-')
				{
					k=-1;
				}
				String s1="";
				while(s.charAt(i)>='0'&&s.charAt(i)<='9')
				{
					s1=s1+s.charAt(i);
					i++;
					if(i==s.length())
					{
						break;	
					}
				}
				int num=Integer.parseInt(s1);
				sum=sum+k*num;
			}
		}
		return sum;
		
	}
	public static void main(String arg[])
	{
		String s="hibro132byebro67goodbyebro-132";
		System.out.println(sumNumber(s));
	}
}




