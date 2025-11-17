package ZZZ1Main;
import ZZZ1.PP;
import ZZZ1.PP1;
import ZZZ1.sub.PP2;
import ZZZ1.sub.PP3;
class userZZZ1 extends PP1,PP2
{
	public static void main(String[]args)
	{
		Ztest1 x=new UserZtest1();
		System.out.print(x.m2(PP.sc.nextInt()));
		System.out.print(x.m4(PP.sc.nextBoolean()));
		System.out.print(x.m5(PP.sc.nextLong()));
		System.out.print(x.m7(PP.sc.nextInt()));
		System.out.print(x.m8(PP.sc.nextFloat()));
		System.out.print(x.m1(PP.sc.nextFloat()));
		System.out.print(x.m3(PP.sc.nextInt()));
		System.out.print(x.m6(PP.sc.nextDouble()));
		System.out.print(x.m9(PP.sc.next()));
	}
}