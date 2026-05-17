//Write a program to check if the given two Strings are formed with same characters or not?
//------------------------------------------------------------------------------------
import java.util.*;
public class SameChars 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       
        char a1[]   =sc.nextLine().toLowerCase().toCharArray();
        char a2[] = sc.nextLine().toLowerCase().toCharArray();
        for(int i = 0  ; i < a2.length ; i++)
        {
            if(!Character.isLetter(a2[i]))
            {
                System.out.println("Invalid Inputs");
                return;
            }
        }
        for(int i = 0  ; i < a1.length ; i++)
        {
            if(!Character.isLetter(a1[i]))
            {
                System.out.println("Invalid Inputs");
                return;
            }
        }
        outer : for(int i = 0  ; i < a1.length ; i++)
        	{
            		for(int  j = 0 ; j < a2.length ; j++)
            		{
            			if(a1[i] == a2[j])
            			{
            				continue outer;
            			}
            		}
            		System.out.println("No");
            		return;
        	}
        outer : for(int i = 0  ; i < a2.length ; i++)
        	{
            		for(int  j = 0 ; j < a1.length ; j++)
            		{
            			if(a1[j] == a2[i])
            			{
            				continue outer;
            			}
            		}		
        			System.out.println("No");
        			return;
        	}
        	System.out.println("Yes");
	}

}
