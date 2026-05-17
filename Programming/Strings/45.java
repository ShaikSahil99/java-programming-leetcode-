import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Scanner me=new Scanner(System.in);		
		String s=me.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				s1="";
				for(int k=i;k<=j;k++)
				{
					s1=s1+s.charAt(k);;
				}
				System.out.print(s1+" ");
			}
			
		}
	
	/*
		int a[]={1,2,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]);
				}
				System.out.println();
			}
		}
	*/
	}
}