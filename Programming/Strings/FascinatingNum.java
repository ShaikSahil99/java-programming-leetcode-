hjjjjjllll/L?k<
=_)9999999999999999------------------------------------------------------------import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Write your code here.
        int n=sc.nextInt();
        String s=n+""; int c=0;
        String s1="";
        int fasc=1;
        if(n<0)
        {
            n=-n;
        }
        if(n!=0 && n>100)
        {
            for(int i=2;i<=3;i++)
            {
                fasc=n*i;
                s=s+fasc;
            }
            for(int i=1;i<=9;i++)
            {
                for(int j=0;j<s.length();j++)
                { 
                    String ch=s.charAt(j)+"";
                    int k=Integer.parseInt(ch);
                    if(i==k)
                    {
                        c++;
                        break;
                    }
                }
            }
            if(c==9)
            {
                System.out.print("Fascinating Number");
            }
            else
            {
                System.out.print("Not a Fascinating Number");
            }
            
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
