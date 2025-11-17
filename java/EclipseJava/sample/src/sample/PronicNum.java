package sample;
import java.util.*;
public class PronicNum {
	public static boolean isReverse(int n)
	{
		String s=""+n;
		int k=s.length()-1;
		while(k>=0)
		{
			String h=s.substring(k)+s.substring(0,k);
			System.out.println(s.substring(k)+" "+s.substring(0,k)+" "+k);
			if(!isPrime(Integer.valueOf(h)))
			{
				return false;
			}
			k--;
		}
		return true;
	}
	public static boolean isPrime(int n)
	{
		int l=(int)Math.sqrt(n);
		for(int i=2;i<=l;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println((isPrime(a)&&isReverse(a))?"Circular Prime":"Not a Circular Prime");
	}
	
}
