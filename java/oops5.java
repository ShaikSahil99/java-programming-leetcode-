import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	void m1()
	{
		System.out.print("m1 met of A");
	}
	float m2(long a)
	{
		System.out.print(a);
		System.out.print("m2 met of A");
		return sc.nextFloat();
	}
}
class B 
{
	String a=A.sc.next();
	float call(char a)
	{
		A obj=new A();
		char c=obj.sc.next().charAt(0);
		obj.m1();
		System.out.println(obj.m2(A.sc.nextLong()));
		System.out.print(obj.a+" "+this.a+" "+a);
		return A.sc.nextInt();
	}
	String m2(int a)
	{
		System.out.println(a);
		return A.sc.next();
	}
	public static void main(String[]args)
	{
		B obj1=new B();
		System.out.print(obj1.call(A.sc.next().charAt(0)));
	}
}
      