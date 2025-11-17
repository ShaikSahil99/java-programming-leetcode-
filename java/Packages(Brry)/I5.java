package p1.p2.p3;
import p1.A;
public interface I5
{
	int m13(float a);
	default void m14(String a)
	{
		System.out.print(a);
	}
}