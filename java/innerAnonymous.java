import java.util.Scanner;
interface I1
{
	Scanner sc=new Scanner(System.in);
	String m1(int a);
	float m2(long l);
	I1 x=new I1()
	{
		public String m1(int a)
		{
			return sc.next();
		}
		public float m2(long l)
		{
			return sc.nextFloat();
		}
	};
	public static void main(String[]arg)
	{
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.nextLong()));
	}
	
}