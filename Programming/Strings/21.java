import java.util.*;
class A
{
	static String adharValidate(String s)
	{
		int a=0;
		for(int i=0;i<s.length();i++)
		{
			if(i==4||i==9)
			{
				if(!(s.charAt(i)==' '))
				{
					a++;
				}
			}
			else if(!(s.charAt(i)>='0'&&s.charAt(i)<='9'))
			{
				a++;
			}
		}
		if(a==0)
		{
			return "Valid";
		}
		else
		{
			return "Not Valid";
		}
	}
	public static void main(String[]arg)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		if(s.length()==14)
		{
			System.out.print(adharValidate(s));
		}
		else
		{
			System.out.print("Not Valid");
		}
	} 
}