//Write a Program to print Reverse the Given Words in a Given String without Changing words Position?
//---------------------------------------------------------------------------------
import java.util.Scanner;
class Main
{
	public static void main(String args[])
    	{
       		Scanner sc = new Scanner(System.in);
        	String sent  = sc.nextLine(); 
       		sentReverse(sent.split(" "));
    	}
    	public static void sentReverse(String [] words)
	{
        	for(int i = 0 ; i < words.length ; i++)
		{
            		for(int j = words[i].length() - 1; j >= 0 ; j--)
			{
                		System.out.print(words[i].charAt(j));
            		}
            		System.out.print(" ");
        	}
    	}
}