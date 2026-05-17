class A
{
	static void table(int n)
	{
		System.out.print(2*n+"  ");
		
		if(n==10)
		{
			return;
		}
		table(n+1);
	}
	public static void main(String[]arg)
	{
		int n=1;
		table(n);
		
	}
}
