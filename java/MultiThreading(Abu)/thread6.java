class A 
{
	void m1()
	{
		synchronized(this)
		{
			for(int i=0;i<=10;i++)
			{
				System.out.print(i+"  ");
			}
			System.out.println();
		}
		for(int i=11;i<=20;i++)
		{
			System.out.print(i+"  ");
		}
		System.out.println();		
	}
}
class B extends Thread						//Sysnchronized block
{
	static A x= new A();
	public void run()
	{
		x.m1();
	}
	public static void main(String[]args)
	{
		B t1=new B();
		B t2=new B();
		t1.start();
		t2.start();
	}	
}