import java.util.Scanner;
class Me
{
	static Me s=new Me();
   static Scanner sc=new Scanner(System.in);
	
	String m1()
	{
		return sc.next();
	}
	String m2(int a,int b)
	{
		return m1();
	}
	static String m3(int a)
	{
		return s.m2(sc.nextInt(),sc.nextInt());
	}

	
public static void main(String[]args)
{
		System.out.print(m3(sc.nextInt()));

}
	


}