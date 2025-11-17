/*int a[]={1,2,3,1,4,5,7,4,3,10};
Output :
      1 - 2 
      2 - 1 
      3 - 2 
      4 - 2
      5 - 1 
      7 - 1 
     10 - 1 
---------------------------------------------------------------------*/
import java.util.*;
class B
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();      //  TreeSet can also be used here
		int a[]={1,2,3,1,4,5,7,4,3,10};
		for(int i=0;i<a.length;i++)
		{
			lhm.put(a[i], lhm.getOrDefault(a[i],0)+1);
			System.out.println(lhm);
		}
		
	}
}