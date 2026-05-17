import java.util.*;
class A
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s="hii bro isisnxisnxi am a Sahil";
		String str[]=s.split(" ");
		int big=str[0].length();
		String bigg="";
		String small="";
		for(int i=1;i < str.length;i++)
		{
			if(str[i].length()>big)
			{
				big=str[i].length();
				bigg=str[i];
			}
			if(str[i].length()<big)
			{
				big=str[i].length();
				small=str[i];
			}
		}
		System.out.println(bigg);
		System.out.print(small);
	}
}