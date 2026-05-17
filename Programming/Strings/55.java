import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(); int c=0;
		s=s.replace(" ","");
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			c++;
			if(c%3==0)
			{
				System.out.println();
			}
		
		}
	}	
}