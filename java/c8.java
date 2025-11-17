import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	String a;
	int b;
	A(String c,int d)
	{
		a=c;
		b=d;	
	}  
	A(A x)
	{
			System.out.print(x.a+" "+x.b);
	}
	A()
	{
	}
	public static void main(String[]args)
	{

	A obj=new A(new A(sc.next(),sc.nextInt()));
	A obj1=new A(sc.next(),sc.nextInt());	
	A obj2=new A(sc.next(),sc.nextInt());
	new A(obj);		

	
	}
}
    