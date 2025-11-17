package z;
import p1.*;
import p1.p2.*;
public class Z extends B implements I1,I2,I3,p1.p2.p3.I4,p1.p2.p3.I5
{
	public Z()
	{
		super(A.sc.nextInt());
	}
	public int m2(String a)
	{
		System.out.print(a);
		return A.sc.nextInt();
	}
	public long m5(String a)
	{
		System.out.print(a);
		return A.sc.nextLong();
	}
	public long m7(String a)
	{
		System.out.print(a);
		return A.sc.nextLong();	
	}
	public long m9(String a)
	{
		System.out.print(a);
		return A.sc.nextLong();	
	}
	public int m11(float a)
	{
		System.out.print(a);
		return A.sc.nextInt();	
	}
	public int m13(float a)
	{
		System.out.print(a);
		return A.sc.nextInt();	
	}
	public static void main(String[]args)
	{
		A obj=new A(A.sc.nextInt());
		System.out.print(obj.m1(A.sc.nextInt()));

		
		B obj1=new Z();
		System.out.print(obj1.m2(A.sc.next()));
		System.out.print(obj1.m3(A.sc.nextFloat()));
		
		
		I1 obj2=(Z)obj1;
		obj2.m4(A.sc.nextDouble());
		System.out.print(obj2.m5(A.sc.next()));

		I2 obj3=(Z)obj1;
		obj3.m6(A.sc.next());
		System.out.print(obj3.m7(A.sc.next()));
	
		I3 obj4=(Z)obj1;
		System.out.print(obj4.m8(A.sc.next()));
		System.out.print(obj4.m9(A.sc.next()));
	
		p1.p2.p3.C ob=new p1.p2.p3.C(A.sc.nextFloat());
		System.out.print(ob.m10(A.sc.nextShort()));
		
		p1.p2.p3.I4 obj5=(Z)obj1;
		System.out.print(obj5.m11(A.sc.nextFloat()));
		obj5.m12(A.sc.next());//p1.p2.p3.I4.m12(A.sc.next());
		
		p1.p2.p3.I5 obj6=(Z)obj1;
		System.out.print(obj6.m13(A.sc.nextFloat()));
		obj6.m14(A.sc.next());
	}
}







