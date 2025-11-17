package sample;
import java.util.*;
public class Strings
{
	public static String Chars(String s)
	{
		LinkedHashMap<String,Integer> nm=new LinkedHashMap<>();
		int size=s.length();
		String a[]=s.split(" ");
		outer:for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i].equals(a[j]))
				{
					continue outer;
				}
			}
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					c++;
				}
			}
			System.out.println(c+" ");
		
		}
		System.out.println(Arrays.toString(a));
		System.out.println(nm);
		return "";
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Scanner me = new Scanner(System.in);
			String s="do not trouble the trouble if you trouble the trouble the trouble will troubles you i am not the trouble i am the truth";
			System.out.print(Chars(s));
	}

}
