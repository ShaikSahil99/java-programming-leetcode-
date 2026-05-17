import java.util.*;
class A
{
    public static void main(String[]arg)
    {
        Scanner me=new Scanner(System.in);
        int n=me.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=me.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        int i;
        for(i=min+1;i<max;i++)
        {
            int j;
            for(j=0;j<n;j++)
            {
                if(a[j]==i)
                {
                    break;
                }
            }
            if(j==n)
            {
                System.out.print(i+" ");
            }
        }
    }
}