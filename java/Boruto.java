package PA;
import PA.Naruto;
public interface Boruto
{
	public default String m2(int a)
	{
		System.out.print("Defined Method of Interface");
		return Naruto.sc.next();	
	}
}