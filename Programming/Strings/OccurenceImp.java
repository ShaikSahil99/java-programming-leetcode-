/*Write a program to count occurrence of all words in a sentence and print the counts for each word in a decreasing order with respect to word?
Note : If the same word has same count you should print those words in alphabetical order.
Example:
Input 1 :          the cups on the table are clean you can use the cups if you need
Output 1 :
the - 3
cups - 2
you - 2
are - 1
can - 1
clean - 1
if - 1
need - 1
on - 1
table - 1
use - 1
Input 1 :          do not trouble the trouble if you trouble the trouble the trouble will troubles you i am not the trouble i am the truth

Output 1 :

trouble - 6
the - 5
am - 2
i - 2
not - 2
you - 2
do - 1
if - 1
troubles - 1
truth - 1
will - 1
--------------------------------------------------------------------*/
import java.util.*;
class A
{
	public static void main(String[]arg)
	{
		String s="do not trouble the trouble if you trouble the trouble the trouble will troubles you i am not the trouble i am the truth";
		String a[]=s.split(" ");
		
		outer : for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i].equals(a[j]))
				{
					continue outer;
				}
			}
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{	
					c++;
				}
			}
		}
		Arrays.sort(a,Comparator.comparing(String::length).reversed());
		for(String k: a)
		{
			System.out.println(k+" - "+k.length());
		}
		
		
		
		
	}
}
