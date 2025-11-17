package ZZZ;
import java.util.*;
public class Z
{
	public static Scanner sc=new Scanner(System.in);
	public String s=sc.next();
	public Z(int a)
	{
		System.out.print("Para Constructor Z");	
	}
	public Z()
	{
		this(sc.nextInt());
		System.out.print("Default Constructor Z");
	}
	public int m1(float a)
	{
		return sc.nextInt();
	}	

}
      