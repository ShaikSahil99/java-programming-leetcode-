import java.util.*;
class A
{
	static String bigWord(String s)
	{
		int len=0;
		String k="";
		String a[]=s.split(" ");
		for(int i=0;i < a.length;i++)
		{
			String t=a[i];
			if(len < t.length())
			{
				len=t.length();
				k=t;	
			}
		}
		return k;
	}
	public static void main(String[]arg)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		System.out.print(bigWord(s));
	} 
}