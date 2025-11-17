package p1;
public abstract class B
{
	public B(int a)
	{
		System.out.print(a);
	}
	public abstract int m2(String a);
	public String m3(float a)
	{
		System.out.print(a);
		return A.sc.next();
	}
}