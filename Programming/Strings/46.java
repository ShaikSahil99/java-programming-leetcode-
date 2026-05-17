import java.util.Scanner;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		int z=0;
		String value=sc.next();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				s1="";
				for(int k=i;k<=j;k++)
				{
					s1=s1+s.charAt(k);
				}
				
				if(value.equals(s1))
				{
					z=1;
					break;
				}
			}
		}
		if(z==0)
		{
			System.out.print("Not Found");
		}
		else
		{
			System.out.print("Found");
		}
	}
	
}