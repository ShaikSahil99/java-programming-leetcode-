import java.util.*;
class A
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=451567;
		String s=String.valueOf(n);
		char a[]=s.toCharArray();
		Arrays.sort(a);
		s=String.copyValueOf(a);
		System.out.print(Integer.parseInt(s));		
	}
}
class B
{
	public static void main(String[] arg)
	{
		int n=451567;
		List<Integer> l=new ArrayList<>();
		while(n!=0)
		{
			l.add(n%10);
			n=n/10;
		}
		Arrays.sort(l);
		System.out.print(l);
	}
}
