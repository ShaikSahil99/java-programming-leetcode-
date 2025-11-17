package p1.p2;
import p1.A;
public interface I2
{
	default void m6(String a)
	{
		System.out.print(a);
	}
	long m7(String a);
}