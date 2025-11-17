import java.util.Scanner;
class Me
{
	static Me s=new Me();
   static Scanner sc=new Scanner(System.in);
	
	boolean m1(String a)
	{
		return sc.nextBoolean();
	}
	String m2(int a)
	{
		return sc.next();
	}

	
public static void main(String[]args)
{
	boolean b=s.m1(sc.next());
	if(b==true)
	{
		System.out.print(s.m2(sc.nextInt()));
	}

}
	


}