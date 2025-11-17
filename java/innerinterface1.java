import java.util.Scanner;
interface I1
{
	static Scanner in=new Scanner(System.in);
	String m1(int a);
	float m2(long l);
	interface I2
	{
		long m3(String s);
		char m4(float f);
	}
	public static void main(String[]arg)
	{
		I2 x=new I2()
		{
			public long m3(String s)		
			{
				System.out.println("inner interface method m3");
				return in.nextLong();
			}
			public char m4(float f)
			{
				System.out.println("inner interface method m4");
				return in.next().charAt(0);
			}
				
		};
		I1 y=new I1()
		{
			public String m1(int a)
			{
				System.out.println("outer interface method m1");
				return in.next();
			}
			public float m2(long l)
			{
				System.out.println("outer interface method m2");
				return in.nextFloat();
			}
		};
		System.out.println(y.m1(in.nextInt()));
		System.out.println(y.m2(in.nextLong()));
		System.out.println(x.m3(in.next()));
		System.out.println(x.m4(in.next().charAt(0)));
	}
}
