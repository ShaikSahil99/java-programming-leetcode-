//Xylem && Phloem
import java.util.Scanner;
class A
{
	public static void main(String args[])
    	{
		Scanner sc=new Scanner(System.in);
		{
			int n=sc.nextInt(),sum1=0,sum2=0;
			String s=""+n;
			for(int i=s.length()-1;i>=0;i--)
			{
				if(i==0||i==s.length()-1)
				{	
					sum1=sum1+Integer.parseInt(s.charAt(i)+"");
				}
				else
				{
					sum2=sum2+Integer.parseInt(s.charAt(i)+"");
					
				}
			}
			if(sum1==sum2)
			{
				System.out.print("Xylem");
			}
			else 
			{
				System.out.print("Phloem");
			}
		}
	}
}
class B
{
	public static void main(String args[])
    	{
		Scanner sc=new Scanner(System.in);
		{
			int n=sc.nextInt(),sum1=0,sum2=0;
			String s=""+n;
			for(int i=s.length()-1;i>=0;i--)
			{
				if(i==0||i==s.length()-1)
				{	
					sum1=sum1+(s.charAt(i)-'0');
				}
				else
				{
					sum2=sum2+(s.charAt(i)-'0');
				}
			}
			if(sum1==sum2)
			{
				System.out.print("Xylem");
			}
			else 
			{
				System.out.print("Phloem");
			}
		}
	}
}
class C
{
	public static void main(String args[])
    	{
        
        	Scanner sc  =new Scanner(System.in);
        	String n = sc.next();
        	if(n.charAt(0) == '-')
		{
            		n = n.substring(1);
        	}
        	int lenOfNum = ("" + n).length();
        	if(lenOfNum < 3)
		{
            		System.out.println("Invalid Input");
        	}
		else
		{
            		char f = n.charAt(0);
            		char l = n.charAt(lenOfNum - 1);
            		String ss = n.substring(1 , lenOfNum - 1);
            		int sum = 0;
            		int first  = (int)f - 48;
            		int last  = (int)l - 48;
            		int num = Integer.valueOf(ss);
            
           		while(num >  0)
			{
                		sum += num % 10;
                		num /=10;
            		}
            		if((first + last ) == sum)
			{
				System.out.println("Xylem Number");
			}
            		else
			{
				System.out.println("Phloem Number");
			}
            
        	}
    	}
}