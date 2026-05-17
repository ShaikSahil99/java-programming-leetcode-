/*Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

*/
import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)	
	{
		String str[]={"flower","flow","flowht"};
		String prefix=str[0];
		for(int i=1;i<str.length;i++)
		{
			while(str[i].indexOf(prefix)!=0)
			{
				System.out.print(str[i]+"   ");
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
		System.out.print(prefix);
		
	}
}
class sample {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub?>,
		String s[]= {"flower","flow","flo"};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<min)
			{
				min=s[i].length();
			}
		}
		String ans="";
		Arrays.sort(s);
		int i=0;int j=0;int k=1;
		for(int m=0;m < min;m++)
		{
			k=0;j=0;
			j=j+m;
			for(i=0;i < s.length-1;i++)
			{
				if(s[i].charAt(j)==s[i+1].charAt(j))
				{
					k++;
				}
			}
			if(k==s.length-1)
			{
				ans=ans+s[i].charAt(j);
			}
			else
			{
				break;
			}
		}
		System.out.println(ans);
		
		
	}

}
