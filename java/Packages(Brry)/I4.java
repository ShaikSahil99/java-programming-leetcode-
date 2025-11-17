package p1.p2.p3;
import p1.A;
public interface I4
{
	int m11(float a);
	default void m12(String a)
	{
		System.out.print(a);
	}
}