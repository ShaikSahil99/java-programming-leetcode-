import java.util.Scanner;
class B
{
    static Scanner sc=new Scanner(System.in);
     static B m1(boolean a)
     {
		return new B();
     }
     boolean m2(B a)
     {
		return sc.nextBoolean();
	}
     String m3(boolean a)
 	{
		return sc.next();
	}
     float m4(int a)
      {
		return sc.nextFloat();
	}
      public static void main(String[]args)
      {
	B obj=m1(sc.nextBoolean());
	System.out.println(obj.m2(obj));
	System.out.println(obj.m3(sc.nextBoolean()));
	System.out.println(obj.m4(sc.nextInt()));
       }
}
      
      