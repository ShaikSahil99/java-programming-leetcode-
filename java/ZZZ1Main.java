package ZZZ1Main;
import ZZZ1.PP;
import ZZZ1.PP1;
import ZZZ1.sub.PP2;
import ZZZ1.sub.PP3;
class Ztest1 extends PP1 implements PP2,PP3
{
	Ztest1()
	{
		super(PP.sc.nextLong());
	}
	public long m2(int a)
	{
		return PP.sc.nextLong();
	}
	public String m4(boolean b)
	{
		return PP.sc.next();
	}
	public char m5(long l)
	{
		return PP.sc.next().charAt(0);
	}
	public String m8(int b)
	{
		return PP.sc.next();
	}
	public char m9(float f)
	{
		return PP.sc.next().charAt(0);
	}
}