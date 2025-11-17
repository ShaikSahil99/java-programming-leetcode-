import java.util.Scanner;
class B
{
	static B obj=new B();
    static Scanner sc=new Scanner(System.in);
     String m1(int a)
     {
		String b=sc.next();
		return b;
     }
     boolean m2(String a)
     {
		boolean c=sc.nextBoolean();
		return c;
	}
     long m3(boolean a)
 	{
		long d=sc.nextLong();
		return d;
	}
      public static void main(String[]args)
      {
		System.out.print(obj.m3(obj.m2(obj.m1(sc.nextInt()))));
      }
}
      
      