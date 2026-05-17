/*
Write a a program to rotate the given String in Anti-Clock Wise Rotation.
Note : You should not convert the string into char array. 
Input 1 :       abc
Output 1 :      cab bca abc
------------------------------------------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
    	{
       		Scanner sc = new Scanner(System.in);
       		String s = sc.nextLine(); 
      	 	if(s.length() < 3)
		{
           		System.out.println("Invalid Input");
           		return;
       		}
       		int c = 0;
       		for(int i = s.length() - 1 ; c < s.length()+2 ; i--, c++ )
		{
           		i = i % s.length();
           		int c2 = 0;
           		for(int j = i ; c2 < s.length() ; j++, c2++)
			{
               			j = j % s.length();
               			System.out.print(s.charAt(j));
           		}
           		System.out.println();
       		}
    	}
}

//----------------------------
/*
class B
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner me=new Scanner(System.in);
		String s=me.next();int c=0;int c1=0;
		for(int i=s.length()-1;c1<s.length();i--,c1++)
		{
			c=0;
			for(int j=i;;j++,c++)
			{	
				if(c==s.length())
				{
					System.out.println(" ");
					break;
				}
				j=j%s.length();
				System.out.print(s.charAt(j));
	
				
			}
		}
	}
}
*/