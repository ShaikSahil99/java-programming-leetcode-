import java.util.Scanner;
interface I1
{
	Scanner sc = new Scanner(System.in);
	String m1(long l);
	default String m2(float f)
	{
		return sc.next();
	}	
	
		
}
interface I2
{
	long m3(int a);
	default int m4(boolean b)
	{
		System.out.println("defined method of I2");
		return I1.sc.nextInt();
	} 
	I2 y=new I2()
	{
		public long m3(int a)
		{
			return I1.sc.nextLong();
		}
	};
}
class Z 
{
	static I1 x=new I1()
	{
		public String m1(long l)
		{
			return I1.sc.next();
		}
	};	
	void display()
	{
		System.out.println(Z.x.m1(I1.sc.nextLong()));
	}
	
}
class Test
{
	public static void main(String[]arg)
	{
		Z obj1=new Z();
		obj1.display();
	}
}