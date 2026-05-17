import java.util.*;

class A
{
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String s1="";
		for(int j=0;j<s.length();j++)
		{
			s1=s.charAt(j)+s1;
		}
		System.out.println(s1+" ");
		if(s1.equals(s))
		{
			System.out.print("Pallindrome");
		}		
		else 
		{	
			System.out.print("Not a Pallindrome");
		}
			
	}
}