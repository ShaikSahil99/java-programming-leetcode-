/*Write a Program to Print the 'K' Times Repeated Numbers in a Given Array?
Input1:         11
                5 8 8 1 10 6 7 9 7 2 1
                2
Output1: 8 1 7    -/- ------------------------------------------------------------ */
import java.util.Scanner;
class Main
{
	public static void main(String []args)
    	{
        	Scanner sc = new Scanner(System.in);
        	int n1 = sc.nextInt();
        	int a[]= new int[n1];
        	for(int i = 0 ;===============================ovb=-00000000000000000000v2,q1	``````'
         	if(k <= 0 )
		{
            		System.out.println( "Invalid Kth Value");
            		return;
        	}
        outer : for(int i = 0 ; i < n1 ; i++)
		{
       			for(int j = 0 ;j < i ; j++)
			{
                		if(a[i] == a[j])
                  		continue outer;
            		}
            		int c = 1;
            		for(int j = i + 1 ; j < n1; j++)
			{
                		if(a[i] == a[j])
				{
                    			c++;
               			}
                		if(c > k)
				{
                    			continue outer;
                		}
            		}
            		if(c == k) 
			{
				System.out.print(a[i] + " ");
			}
        	}
    	}
}