/*Input : ab#g$f

Output : fg#b$a


Input : s&ya$k

Output : k&ay$s
------------------------------------------------------*/
import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<Character> al=new ArrayList<>();
		ArrayList<Character> al1=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				al.add(s.charAt(i));
			}
			else
			{
				al1.add(s.charAt(i));
			}
		}
		int k=1;int t=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				System.out.print(al.get(al.size()-k));
				k++;	
			}
			else
			{
				System.out.print(al1.get(t));
				t++;
			}
		}
	}
}

