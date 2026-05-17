import java.util.Scanner;
import java.util.ArrayList;
class A
{
	public ArrayList<Integer> reverse(ArrayList<Integer> list)
	{
		ArrayList<Integer> Revlist=new ArrayList<Integer>();
		for(int i=list.size()-1;i>=0;i--)
		{
			RevList.add(list.get(i));
		}
		return RevList;
	}
	int check(ArrayList<Integer> list,int index)
	{
		int sum=0;;
		int s=0,e=list.size()-1;
		if(list.get(s)>list.get(e))
		{
			sum=list.get(s);
			list.remove(s);
			System.out.println();
		}
		if(list.get(e)>list.get(s))
		{
			sum=list.get(e);
			list.remove(e);		
			System.out.println();
		}
		if(list.get(e)==list.get(s))
		{
			sum=list.get(index);
			if(index==0)
			{
				list.remove(index);
			}
			else
			{
				list.remove(index);
			}
		}
		return sum;
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int sum1=0;int sum2=0;
		ArrayList<Integer> list=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		A obj=new A();
		A obj2=new A();
		for(int j=0;j<=list.size()-1;j++)
		{
			if(j%2==0)
			{
				
				System.out.println("A choice");
				int x=sc.nextInt();
				sum1=sum1+obj.check(list, x);
				
			}
			else
			{
				System.out.println("B choice");
				int y=sc.nextInt();
				sum2=sum2+obj.check(list, y);
			}
		}
		System.out.println(sum1);
		System.out.print(sum2);
		
	}	
}