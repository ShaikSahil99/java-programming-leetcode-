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