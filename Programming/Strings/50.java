
import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.replace(" ","");
		char a[]=s1.toCharArray();
		Arrays.sort(a);
		s1=String.copyValueOf(a);
		System.out.print(s1);
	}
}
/*
import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(char i='a';i<='z';i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(i==s.charAt(j))
				{
					s1=s1+s.charAt(j);
				}
			}	
		}
		System.out.print(s1);
	}
}
*/
