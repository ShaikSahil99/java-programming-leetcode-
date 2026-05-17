/*
Input 1 :        progra22mm9

Output 1 :     p2r2o9g2r2a9m2m2

Input 2 :        jAvA334

Output 2 :     j3A3v4A3

Input 3 :        cvcorp

Output 3 :     No Numeric Characters              */
//--------------------------------------------------------------------------------------------
import java.util.*;
class Main
{
	public static void main(String args[])
    	{
       		Scanner sc = new  Scanner(System.in);
       
      		String s = sc.next();
      
      		List<Character> s1 = new ArrayList<>();
      		List<Character> s2 = new ArrayList<>();
      
      		for(int i = 0 ; i < s.length(); i++)
		{
          		char ch = s.charAt(i);
          		if(Character.isDigit(ch))
			{
              			s2.add(ch);
          		}
			else if(Character.isLetter(ch))
			{
              			s1.add(ch);
          		}
			else
			{
              			System.out.println("Invalid Input");
              			return;
          		}
      		}
      		if(s2.size() == 0)
		{
          		System.out.println("No Numeric Characters");
          		return;
      		}
      		int i = 0 , j = 0;
      
      		for( ; i < s1.size() ; i++ , j++)
		{
          		j = j % s2.size();
          		System.out.print(s1.get(i) +"" +  s2.get(j) + "");
      		}
      	}
}