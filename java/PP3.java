package ZZZ1.sub;
import ZZZ1.PP;
import java.util.*;
public interface PP3
{
	public static Scanner sc=new Scanner(System.in);
	String m8(int b);
	char m9(float f);
	public default float m10(String s)
	{
		return PP.sc.nextFloat();
	}
}