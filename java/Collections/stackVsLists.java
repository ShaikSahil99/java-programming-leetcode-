import java.util.*;
class A
{
	public static void main(String []arg)
	{
		LinkedList v=new LinkedList<>();
		
		v.push("Hiiii");
		v.push(30);
		v.push(10);
		System.out.println(v);
		v.pop();
		System.out.println(v);
		ListIterator emr=v.listIterator();
		while(emr.hasNext())
		{
			System.out.print(emr.next()+" ");
		}
	}
}
class B
{
	public static void main(String []arg)
	{
		Stack v1=new Stack<>();
		
		v1.push("Hiiii");
		v1.push(30);
		v1.push(10);
		System.out.println(v1);
		
		v1.pop();
		System.out.println(v1);
		ListIterator emr=v1.listIterator();
		while(emr.hasNext())
		{
			System.out.print(emr.next()+" ");
		}
	}
}