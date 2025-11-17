package ZZZ;
import java.util.*;
public interface PI1
{
	public static Scanner sc=new Scanner(System.in);
	String m8(int b);
	char m9(float f);
	default float m10(String s)
	{
		return sc.nextFloat();
	}
	static String m11(int k)
	{
		return sc.next();
	}
}