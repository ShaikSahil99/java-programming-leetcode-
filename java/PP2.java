package ZZZ1.sub;
import ZZZ1.PP;
import java.util.*;
public interface PP2
{
	String m4(boolean b);
	char m5(long l);
	public default int m6(double d)
	{
		return PP.sc.nextInt();
	}
}