import java.util.Scanner;
class Me
{
   	static Scanner sc=new Scanner(System.in);
	static Me obj=new Me();
	
	String m1(int a)
	{
		
		return sc.next();	
	}
	boolean m2(String a)
	{
		return sc.nextBoolean();
	}
	long m3(boolean a)
	{
		return sc.nextLong();
	}
	boolean m4(long a)
	{
		return sc.nextBoolean();
	}
	
	public static void main(String[]args)
	{
		System.out.println(obj.m4(obj.m3(obj.m2(obj.m1(sc.nextInt())))));
	}
	

}