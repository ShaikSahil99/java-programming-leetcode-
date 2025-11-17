package PA;
import java.util.*;
public class Naruto
{
	public static Scanner sc=new Scanner(System.in);
	public Naruto()
	{
		this(sc.nextInt());
		System.out.print("Constructor Naruto");	
	}
	private Naruto(int a)
	{
		System.out.print("Para Constructor Naruto");
	}
	protected boolean m1(float a)
	{
		return sc.nextBoolean();
	}	

}


      