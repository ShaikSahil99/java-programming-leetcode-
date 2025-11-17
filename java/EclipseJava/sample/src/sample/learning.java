package sample;
import java.util.*;
public class learning {

	static Scanner z=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String s=z.next();
		int k=0;
		System.out.println(s.length());
		if(s.length()!=10)
		{
			
			k=1;
		}
		for(int i=0;i<s.length();i++)
		{
			
			if(i>=0 && i<=2)
			{
				if(!(s.charAt(i)>='A' && s.charAt(i)<='Z'))
				{
					k=1;
					break;
				}
			}
			if(i==3)
			{
				if(s.charAt(i)!='P' && s.charAt(i)!='C' && s.charAt(i)!='F' && s.charAt(i)!='A' && s.charAt(i)!='H')
				{
					k=1;
					break;
				}
			}
			if(i>=5 && i<=8)
			if(!(s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
				k=1;
				System.out.println(i+"    "+k);
				break;
			}
			System.out.println(i+"    "+k);
		}
		if(k==0)
		{
			System.out.println("Valid macha");
		}
		else if(k==1)
		{
			System.out.println("Denegeyyy");
		}
	}
}
 
