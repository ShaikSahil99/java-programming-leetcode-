package ZZZ;
import java.util.*;
public abstract class Z1
{
	public static Scanner sc=new Scanner(System.in);
	public String s=sc.next();
	public Z1(int a)
	{
		System.out.print("Para Constructor Z");	
	}
	public abstract String m2(float a);
	public int m3(char c)
	{
		return sc.nextInt();
	}
}