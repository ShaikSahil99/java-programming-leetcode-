import java.util.*;
class A
{
	int check(ArrayList<Integer> list,int index)
	{
		int sum=0;
		if(list.get(index)%2==0)
		{
			list=Collections.reverse(list);
		}
		System.out.println(list);
		if(list.get(index)>list.get(index))
		{
			sum=list.get(index);
			list.remove(index);
			System.out.println(list);
			System.out.println();
		}
		if(list.get(index)>list.get(index))
		{
			sum=list.get(index);
			list.remove(index);
			System.out.println(list);		
			System.out.println();
		}
		if(list.get(index)==list.get(index))
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
			System.out.println(list);
		}
		return sum;
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int sum1=0;int sum2=0;int ac=0;int bc=0;
		ArrayList<Integer> list=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		A obj=new A();
		A obj2=new A();
		for(int j=0; j < list.size() + 5; j++)
		{
			if(j%2==0)
			{
				ac++;
				System.out.println("A choice");
				int x=sc.nextInt();
				sum1=sum1+obj.check(list, x);
				
			}
			else
			{
				bc++;
				System.out.println("B choice");
				int y=sc.nextInt();
				sum2=sum2+obj.check(list, y);
			}
		}
		System.out.println("Sum of A choices : "+sum1);
		System.out.println("Sum of B choices : "+sum2);
		if(sum1==sum2)
		{
			if(ac>bc)
			{
				System.out.println("B wins");
			}
			else
			{
				System.out.println("A wins");
			}
		}
		else if(sum1>sum2)
		{
			System.out.println("A wins");
		}
		else 
		{
			System.out.println("B wins");
		}
		
	}	
}