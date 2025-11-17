import java.util.*;
class Main
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>(); //Object can bes used as Generic(but no operations can be done)
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.print
		}
	}
}