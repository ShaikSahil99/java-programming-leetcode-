import java.util.*;
class A
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack<Character> st=new Stack<>();
		String s=sc.nextLine();
		boolean bool=true;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='('||ch=='['||ch=='{')
			{
				st.push(ch);
			}
			else if(!s.isEmpty())
			{
				if(ch==')')
				{
					if(st.pop() != '(')
					{
						bool=false;
						break;
					}
				}
				else if(ch==']')
				{
					if(st.pop()!='[')
					{
						bool=false;
						break;
					}
				}
				else if(ch=='}')
				{
					if(st.pop()!='{')
					{
						bool=false;
						break;
					}
				}
				else 
				{
					bool=false;
					break;
				}
			}
			else 
			{
				bool=false;
				break;
			}
		}
		if(bool)
		{
			System.out.print("Valid");
		}
		else
		{
			System.out.print("Invalid");
		}
	
	}
}