class A
{
	public static void main(String arg[])
	{
		int a[]={9,3,3,3,7,7,8,1,2,2,2,6,5,5,9};
		int i=0,j=0;
		for(i=0;i<a.length-1;i++)
		{
				j=i;
				while(a[j]==a[j+1])
				{
					
					System.out.print(a[j]+" ");
					j++;
					i++;
					if(j==a.length-1)
					{
						break;
					}
				}
				if(j>0 && a[j]==a[j-1])
				{
					System.out.print(a[j]);
					System.out.println();
				}
		}
	}
}