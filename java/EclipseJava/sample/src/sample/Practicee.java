package sample;
import java.util.*;

public class Practicee {
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
