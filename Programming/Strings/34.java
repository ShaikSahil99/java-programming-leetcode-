import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String a[]=s.split(" ");
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			s1="";
			for(int j=0;j<a[i].length();j++)
			{
				s1=a[i].charAt(j)+s1;
			}
			System.out.print(s1+" ");
		}		
			
	}
}