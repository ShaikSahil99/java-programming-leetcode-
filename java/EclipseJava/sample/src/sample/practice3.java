package sample;
import java.util.*;
public class practice3 {

	public static String UniqueSub(String s)
	{
		String ss="";
		for(int i=0;i<s.length()-1;i++)
		{
			outer:for(int j=i+1;j<=s.length();j++)
			{
				ss=s.substring(i,j);
				System.out.println(ss);
				for(int k=0;k<ss.length();k++)
				{
					if(ss.indexOf(""+ss.charAt(k))!=ss.lastIndexOf(""+ss.charAt(k)))
					{
						continue outer;
					}
				}
				System.out.println(ss);
			}
		}
		return "";
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			System.out.println(UniqueSub(s));
	}

}
