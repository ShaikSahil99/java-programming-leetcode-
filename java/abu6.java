import java.util.Scanner;
class A
{
    static Scanner sc=new Scanner(System.in);
     boolean m1(int a)
     {
		System.out.println(a);
		boolean b=sc.nextBoolean();
      		 
      		return b;
      }
     static char m2(float a)
      {
		System.out.println(a);
		char ch=sc.next().charAt(0);
		 
		return ch;
	}
      public static void main(String[]args)
      {
      	A obj = new A();
      	int k=sc.nextInt();
      	System.out.println(obj.m1(k));
	float b=sc.nextFloat();
	System.out.print(m2(b));
       }
}
      
      