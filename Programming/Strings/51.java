import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		String a[]=s.split(" ");
		String b[]=s1.split(" ");
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.print(Arrays.toString(a));
		System.out.print(Arrays.toString(b));
		int i=0,j=0;	
		while(a.length>i && b.length>j)
		{
			if(a[i].compareTo(b[j])==0)
			{
				System.out.print(a[i]+"  ");
				i++;
				j++;
			}
			else if(a[i].compareTo(b[j]) < 0)
			{
				i++;
			}
			else
			{
				j++;
			}
		}
	}
}
class B
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		List<String> l=new ArrayList<>();
		Collections.addAll(l,s.split(" "));
		Collections.addAll(l,s1.split(" "));
		Collections.sort(l, String.CASE_INSENSITIVE_ORDER);
		for(String word: l)
		{
			System.out.print(word+"   ");
		}
	}
}