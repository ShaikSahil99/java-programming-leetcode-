package p1.p2;
import p1.A;
public interface I3
{
	default int m8(String a)
	{
		System.out.print(a);
		return A.sc.nextInt();
	}
	long m9(String a);
}