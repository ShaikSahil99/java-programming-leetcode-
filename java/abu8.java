import java.util.Scanner;
class A
{
    static Scanner sc=new Scanner(System.in);
     int m1(String a)
     {
		System.out.println(a);
      		return sc.nextInt();
      }
      static float m2(boolean a)
      {
		System.out.println(a);
		return sc.nextFloat();
	}
	double m3(char a)
     {
		System.out.println(a); 
      		return sc.nextDouble();
	}
 	
      public static void main(String[]args)
      {
      	A obj = new A();
      	String c=sc.next();
      	System.out.println(obj.m1(c));
	boolean b=sc.nextBoolean();
	System.out.println(m2(b));
	char d=sc.next().charAt(0);
	System.out.println(obj.m3(d));
       }
}
      
      