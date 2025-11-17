import java.util.Scanner;
class B
{
    static Scanner sc=new Scanner(System.in);
      void m1(boolean a)
     {
		System.out.println(a);
      }
     void m2(char a)
      {
		m1(sc.nextBoolean());
	}
     static double m3(double a)
     {
		obj.m2(sc.next().charAt(0));
		return sc.nextDouble();
	}
     long m4(long a)
      {
		System.out.println(m3(sc.nextDouble()));
		return sc.nextLong();
	}
     String m5(String a)
      {
		System.out.println(m4(sc.nextLong()));
		return sc.next();
	}
      public static void main(String[]args)
      {
      	B obj=new B();
	System.out.println(obj.m5(sc.next()));
       }
}
      
      