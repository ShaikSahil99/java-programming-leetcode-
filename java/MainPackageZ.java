package ZZZMain;
import ZZZ.Z;
import ZZZ.Z1;
import ZZZ.PI;
import ZZZ.PI1;
import java.util.*;
class Ztest extends Z1 implements PI,PI1
{
	Ztest()
	{
		super(Z1.sc.nextInt());
	}
	public String m2(float a)
	{
		return Z1.sc.next();
	}
	public String m4(boolean b)
	{
		return PI.sc.next();
	}
	public char m5(long l)
	{
		return PI.sc.next().charAt(0);
	}
	public String m8(int b)
	{
		return PI1.sc.next();
	}
	public char m9(float f)
	{
		return PI1.sc.next().charAt(0);
	}
	public static void main(String[]arg)
	{
		Z x=new Z();
		System.out.println(x.m1(Z1.sc.nextFloat()));
		Ztest y=new Ztest();
		System.out.println(y.m2(Z1.sc.nextFloat()));
		System.out.println(y.m3(Z1.sc.next().charAt(0)));
		System.out.println(y.m4(Z1.sc.nextBoolean()));
		System.out.println(y.m4(Z1.sc.nextBoolean()));
		System.out.println(y.m5(Z1.sc.nextLong()));
		System.out.println(y.m6(Z1.sc.nextDouble()));
		System.out.println(PI.m7(Z1.sc.nextLong()));
		System.out.println(y.m8(Z1.sc.nextInt()));
		System.out.println(y.m9(Z1.sc.nextFloat()));
		System.out.println(y.m10(Z1.sc.next()));
		System.out.println(PI1.m11(Z1.sc.nextInt()));
	}
}