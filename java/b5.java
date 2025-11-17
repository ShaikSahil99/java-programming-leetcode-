import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
    	static int a=sc.nextInt();
    	static char c=sc.next().charAt(0);
	float f=sc.nextFloat();
	long l=sc.nextLong();
   
     	String m1(boolean a)
     	{
		return sc.next();
     	}
	int m2(String a)
	{
		return sc.nextInt();
	}
      	public static void main(String[]args)
      	{
	int b=sc.nextInt();
	char d=sc.next().charAt(0);
	System.out.println(a);
	System.out.println(c);
	System.out.println(new B().f);
	System.out.println(new B().l);
	System.out.print(new B().m1(sc.nextBoolean()));
	System.out.print(new B().m2(sc.next()));

	
	
	}
}
