import java.util.Scanner;
import java.util.ArrayList;
class Main
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();     //Generic is used for Type Safety (Integer class is Generic)
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.contains("hi"));
	}
}