import java.util.*;
class A
{
	static void altVowel(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				if(c%2==0)
				{
					System.out.print(s.charAt(i)+"   ");
				}	
				c++;
			}
		}
	}
	public static void main(String[]arg)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		altVowel(s);
	} 
}