import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		Scanner ip=new Scanner(System.in);
		String s="apple ball apple cat apple";
		String s1=ip.next();
		int k=-1;
		while(true)
		{
			k=s.indexOf(s1,k+1);
			if(k==-1)
			{
				break;
			}
			System.out.print(k+" ");
		}	
	} 
}
class B
{
	public static void findIndices(String s, String s1,int k)
	{
		System.out.println(k);
		k=s.indexOf(s1,k+1);
		if(k==-1)
		{
			return;
		}
		System.out.println(k);
		findIndices(s,s1,k);
	}
	public static void main(String[]arg)
	{
		Scanner ip=new Scanner(System.in);
		String s="apple ball apple cat apple";
		String s1=ip.next();
		int k=-1;
		findIndices(s,s1,k);
	} 
}