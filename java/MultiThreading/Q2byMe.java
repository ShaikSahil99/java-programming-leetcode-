class Bank
{
	public double balance=0;
	public synchronized boolean deposit(double amount, String user) 
	{
		try
		{
			if(amount<=0)
			{
				throw new FundTransferFailureException("Amount can't be zero or Negative");
			}	
			balance += amount;
			System.out.println(user+" - "+"Deposited"+" - "+amount);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	public double getBalance()
	{
		return balance;
	} 
}
class Main
{
	public static void main(String[]args) throws Exception
	{
		Bank acc=new Bank();
		t1 x1=new t1(acc);
		t2 x2=new t2(acc);
		t3 x3=new t3(acc);
		t4 x4=new t4(acc);
		t5 x5=new t5(acc);
		x1.start();
		x2.start();
		x3.start();
		x4.start();
		x5.start();
		Thread.sleep(100);
		System.out.print(acc.getBalance());
	}
}
class t1 extends Thread
{
	Bank obj;
	t1(Bank obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		if(obj.deposit(5000,"t1"))
		{
			System.out.println("t1 - "+"Deposited Successful");
		}
		else 
		{
			System.out.println("t1 - "+"Deposit Failed");
		}
	}
}
class t2 extends Thread
{
	Bank obj;
	t2(Bank obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		if(obj.deposit(5000,"t2"))
		{
			System.out.println("t2 - "+"Deposited Successful");
		}
		else 
		{
			System.out.println("t2 - "+"Deposit Failed");
		}
	}
}
class t3 extends Thread
{
	Bank obj;
	t3(Bank obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		if(obj.deposit(-5000,"t3"))
		{
			System.out.println("t3 - "+"Deposited Successful");
		}
		else 
		{
			System.out.println("t3 - "+"Deposit Failed");
		}
	}
}
class t4 extends Thread
{
	Bank obj;
	t4(Bank obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		if(obj.deposit(0,"t4"))
		{
			System.out.println("t4 - "+"Deposited Successful");
		}
		else 
		{
			System.out.println("t4 - "+"Deposit Failed");
		}
	}
}
class t5 extends Thread
{
	Bank obj;
	t5(Bank obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		if(obj.deposit(5000,"t5"))
		{
			System.out.println("t5 - "+"Deposited Successful");
		}
		else 
		{
			System.out.println("t5 - "+"Deposit Failed");
		}
	}
}

class FundTransferFailureException extends Exception
{
	FundTransferFailureException(String str)
	{
		super(str);
	}
}
