import java.util.*;
interface I
{
	Scanner sc=new Scanner(System.in);
	default int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	String m2(float a, String s);
	
	public static void main(String[]args)
	{
		I x=(a,s)->
		{
			System.out.println(a);
			System.out.println(s);
			return sc.next();
		};
		System.out.println(x.m2(sc.nextFloat(),sc.next()));
	}
	
}