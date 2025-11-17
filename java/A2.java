import java.util.Scanner;
class B
{
    static Scanner sc=new Scanner(System.in);
    static B obj= new B();
      float m1(String a)
     {
		System.out.println(a);
		return sc.nextFloat();
      }
     static boolean m2(char a)
      {
		System.out.println(obj.m1(sc.next()));
		System.out.println(a);
		return sc.nextBoolean();
	}
     double m3(int a)
     {
		System.out.println(m2(sc.next().charAt(0)));
		System.out.println(a); 
		return sc.nextDouble();
	}
      static int m4(boolean a)
      {
		System.out.println(obj.m3(sc.nextInt()));
		System.out.println(a); 
		return sc.nextInt();
	}
      public static void main(String[]args)
      {
      	
	System.out.println(m4(sc.nextBoolean()));
       }
}
      
      