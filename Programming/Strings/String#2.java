/*   "new int[]{9,7,5,10,15,11};"
	op - 7 5 11 (Prime numbers)
*/

class A
{
	static void checkPrime(int n)
	{
		int fc=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				fc++;
			}
		}
		if(fc==1)
		{
			System.out.println(n+"  ");
		}
	}
	public static void main(String[]arg)
	{
		String s="new int[]{9,7,5,10,15,11,12,17};";
		for(int i=0;i<s.length();i++)
		{
			String t="";
			while(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				t=t+s.charAt(i);
				i++;
			}
			try
			{
				int k=Integer.parseInt(t);
				checkPrime(k);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}