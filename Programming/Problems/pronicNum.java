import java.util.*;
class PronicNum {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int t=n;
			int result=0;
			int i;
			for(i=1;i<t;i++)
			{
				if(n%i==0)
				{
					t=n/i;
					System.out.println(i+" "+t);
				}
				if(i==t-1)
				{
					break;
				}
				System.out.println(i+" "+t);

			}
			if(i>=t)
			{
				System.out.println("Not Pronic");
			}
			else
			{
				System.out.println("Pronic");
			}
	}

	
}
