/*Write a Program to print the sum of any two elements in an array which gives the sum as Multiple of 5 in a Given Array?
Input1:     6
	    60 41 49 67 6 73
Output1:  41 49, 49 6, 67 73 -----------------------------------------------------------------------*/
import java.util.Scanner;
class Main
{
	public static void main(String []args)
    	{ 
        	Scanner sc  = new Scanner(System.in); 
        	int n = sc.nextInt();
        	int a[] = new int[n]; 
        	for(int i = 0  ; i< n  ; i++)
		{
            		a[i] = sc.nextInt();
            	}
        	for(int i = 0  ; i < n ; i++)
		{
            		for(int j = i + 1 ; j < n ; j++)
			{
                		if((a[i] + a[j]) % 5 == 0)
				{
                    			System.out.println(a[i] + " " +a[j]);
                		}
            		}
        	}
    	}
}