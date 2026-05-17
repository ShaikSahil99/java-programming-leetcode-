			//Write a program to print Largest Substring without Duplicate Characters.
//---------------------------------------------------------------------------------------------
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        String s = new java.util.Scanner(System.in).nextLine();
        String ss = "";
        String longss = "";
        for(int i = 0 ; i < s.length() - 1 ; i++)
	{
        	outer:for(int j = i + 1 ; j <= s.length(); j++)
		{
                	ss = s.substring(i , j);    
			System.out.println(ss+"   ");          
          		for(int k = 0 ; k < ss.length() ; k++)
			{
                   		if(ss.indexOf("" + ss.charAt(k)) != ss.lastIndexOf("" + ss.charAt(k)))
				{
                        		continue outer;
                   		}
               		}
               		if(longss.length() < ss.length())
			{
                  		longss =ss;
              		}
           	}
      	}
       System.out.println(longss);
       
    }
}
	//Write a program to print Largest Sub-Array without Duplicate Characters.
//---------------------------------------------------------------------------------------------

class A
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char a[]={'a','k','a','n','k','s','h','a'};
			int k=0;
			char result[]={};
			for(int i=0;i<a.length-1;i++)
			{
				outer:for(int j=i+1;j<a.length;j++)
				{
					char c[]=Arrays.copyOfRange(a,i,j);
					for(int t=0;t<c.length;t++)
					{
						for(int e=0;e<c.length;e++)
						{
							if(c[t]==c[e] && t!=e)
							{
								continue outer;
							}
						}
						if(c.length>k)
						{
							k=c.length;
							result=c;
						}
					}
				}
			}
			System.out.print(Arrays.toString(result));
	}

}