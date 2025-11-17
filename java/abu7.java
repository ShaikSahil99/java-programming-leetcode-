import java.util.Scanner;
class A
{
    static Scanner sc=new Scanner(System.in);
     static boolean m1(boolean a)
     {
		System.out.println(a);
      		return sc.nextBoolean();
      }
     char m2(char a)
      {
		System.out.println(a);
		return sc.next().charAt(0);
	}
	  static double m3(double a)
     {
		System.out.println(a); 
      		return sc.nextDouble();
	}
 	long m4(long a)
      {
		System.out.println(a); 
		return sc.nextLong();
	}
	 static String m5(String a)
      {
		System.out.println(a); 
		return sc.next();
	}
      public static void main(String[]args)
      {
      	A obj = new A();
      	boolean c=sc.nextBoolean();
      	System.out.println(m1(c));
	char b=sc.next().charAt(0);
	System.out.println(obj.m2(b));
	double d=sc.nextDouble();
	System.out.println(m3(d));
	long l=sc.nextLong();
	System.out.println(obj.m4(l));
	String s=sc.next();
	System.out.println(m5(s));
       }
}
      
      