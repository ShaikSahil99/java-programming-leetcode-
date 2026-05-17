import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		char a[]=s.toCharArray();    
		char b[]=s1.toCharArray();   
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));System.out.println(Arrays.toString(b));
		char c[]=new char[a.length+b.length];
		int i=0,j=0,k=0;			
		System.out.println(c.length);
		while(i<a.length && j<b.length)
		{
			if(a[i]>b[j])
			{
				c[k]=b[j];
				k++;
				j++;
			}
			else 
			{
				c[k]=a[i];
				k++;
				i++;
			}
		}
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			k++;
			j++;
		}
		for(char t:c)
		{
			System.out.print(t+" ");
		}
		s=String.copyValueOf(c);
		System.out.print(s);
	}

}
class B
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		List<Character> l=new ArrayList<>();
		Collections.addAll(l,s.toCharArray());
		Collections.addAll(l,s1.toCharArray());  
		Collections.sort(l);
		for(char ch:l)
		{
			System.out.print(ch);
		}
	}
}
