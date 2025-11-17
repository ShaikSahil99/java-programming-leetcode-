package sample;
import java.util.*;
public class Strings2 {

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
