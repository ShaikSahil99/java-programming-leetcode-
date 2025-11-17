package ZZZ;
import java.util.*;
public interface PI
{
	public static Scanner sc=new Scanner(System.in);
	String m4(boolean b);
	char m5(long l);
	default int m6(double d)
	{
		return sc.nextInt();
	}
	static int m7(long a)
	{
		return sc.nextInt();
	}
}