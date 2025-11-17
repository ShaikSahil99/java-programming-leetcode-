package MainPA;
import PA.Naruto;
import PA.Boruto;
class testPA extends Naruto implements Boruto
{
	private String s=sc.next();
	public static void main(String[]arg)
	{
		testPA x=new testPA();
		System.out.print(x.s);
		System.out.print(x.m1(sc.nextFloat()));
		System.out.print(x.m2(sc.nextInt()));
	}
}