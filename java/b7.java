import java.util.Scanner;
class B
{
	static B obj=new B();
	static int a;
	static char c;
	float f;
	long l;
    static Scanner sc=new Scanner(System.in);
     void m1(int k)
     {
	a=sc.nextInt();
	c=sc.next().charAt(0);
	obj.f=sc.nextFloat();
	obj.l=sc.nextLong();
     }
     void m2(int n)
     {
	a=sc.nextInt();
	c=sc.next().charAt(0);
	obj.f=sc.nextFloat();
	obj.l=sc.nextLong();
	}
      public static void main(String[]args)
      {
		System.out.println(a);
		System.out.println(c);
		System.out.println(obj.f);
		System.out.println(obj.l);
		obj.m1(sc.nextInt());
		System.out.println(a);
		System.out.println(c);
		System.out.println(obj.f);
		System.out.println(obj.l);
		obj.m2(sc.nextInt());
		System.out.println(a);
		System.out.println(c);
		System.out.println(obj.f);
		System.out.println(obj.l);
      }
}