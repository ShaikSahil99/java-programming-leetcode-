import java.util.Scanner;
class A
{
    static Scanner sc=new Scanner(System.in);
     static int m1(boolean a)
     {
		System.out.println(a);
      		return sc.nextInt();
      }
      float m2(String a)
      {
		System.out.println(m1(sc.nextBoolean()));
		System.out.println(a);
		return sc.nextFloat();
	} 	
      public static void main(String[]args)
      {
      	A obj = new A();
      	System.out.println(obj.m2(sc.next()));
       }
}
      
      