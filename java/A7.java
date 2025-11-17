import java.util.Scanner;
class Me
{
   static Scanner sc=new Scanner(System.in);
	String m1(int a)
	{
		return sc.next();
	}
	String m2(boolean a)
	{
		return m1(sc.nextInt());
	}
	boolean m3(float a)
	{
		boolean b=sc.nextBoolean();
		return b;
	}
	boolean m4(char a)
	{
	       	return m3(sc.nextFloat());
	}

public static void main(String[]args)
{
	Me s=new Me();
	System.out.println(s.m2(sc.nextBoolean()));
	System.out.println(s.m4(sc.next().charAt(0)));
}
}