package p1;
public interface I1
{
	default void m4(double a)
	{
		System.out.print(a);
	}
	long m5(String a);
}