import java.util.*;
abstract class Phonepay
{
	static Scanner sc=new Scanner(System.in);
	abstract float viewBalance(int upi);
	abstract float Tomobileno(long mobileno,int upi);
	abstract float ToBank(long acntno,int upi);
}
class SBI extends Phonepay
{
	long acntno;
	float balance=1000;
	long mobileno;
	private int upi=5580;
	private long debitno=123456789;
	private int cvv=676;
	int y=0;
	void mismatch()
	{
		System.out.println("\t\t\t\t\t\t\t    Enter..the New..UPI..pin:");
		int m=sc.nextInt();
		System.out.println("\t\t\t\t\t\t\t    Re-Enter..the New..UPI..pin:");
		int n=sc.nextInt();
		if(m==n)
		{
			setUPI(n);
			System.out.println("\t\t\t\t\t\t\t    UPIpin..Updated..Successfully");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t    Mismatched..UPI..Pin..try..again");
			mismatch();
		}				
	}
	int verification()
	{
		System.out.println("\t\t\t\t\t\t\t    Enter..the..DebitcardNumber..linked..to..your..account :");
		getDebitno(sc.nextLong());
		getcvv(sc.nextInt());
		System.out.println("\t\t\t\t\t\t\t    Enter..the..OTP..received..on..Mobile..number..linked..to..your..account");
		int l=sc.nextInt();
		System.out.println("\t\t\t\t\t\t\t    Enter..the New..UPI..pin:");
		int m=sc.nextInt();
		System.out.println("\t\t\t\t\t\t\t    Re-Enter..the New..UPI..pin:");
		int n=sc.nextInt();
		if(m==n)
		{
			setUPI(n);
			System.out.println("\t\t\t\t\t\t\t    UPIpin..Updated..Successfully");
			y=y+2;
		}
		else
		{
		System.out.println("\t\t\t\t\t\t\t    Mismatched..UPI..Pin..try..again");
		mismatch();
		}
		return n;	
	}
	float wrongPin()
	{
			int p=0,t=0,i=0;
			System.out.println("\t\t\t\t\t\t\t    Entered..wrong..pin..please..enter..valid..pin");
			for(i=3;i>=0;i--)
			{
				
				int j=sc.nextInt();
				if(j==upi)
				{
					p=j;
					setUPI(j);
					break;
				}
				else
				{
					p=j;
					System.out.println("\t\t\t\t\t\t\t    "+"please..enter..valid..pin "+(i-1)+"..attempts..left");
					if(i==1)
					{
			
						System.out.println("\t\t\t\t\t\t\t    No..attempts..left..press..0..to..change..the..UPIpin");
						int k=sc.nextInt();
						if(k==0)
						{
							t=verification();
							
						}
						i--;
						break;
					}
				}	
	
				
			}
			if(i==0)
			{
				return t;
			}
			else
			{
				return p;
			}
	}
	float InsufficientBalance(float s)
	{
		System.out.println("\t\t\t\t\t\t\t    "+"Available..Balance: "+balance+"..please..Enter..valid..amount");
		float a=sc.nextFloat();
		if(a>s)
		{
			System.out.println("\t\t\t\t\t\t\t    Insufficient..Balance..in..your..Bank..Account");
			return InsufficientBalance(s);
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t    Transaction..Successful");
			System.out.print("\t\t\t\t\t\t\t    "+a+"..has..been..deduced..from..your bank..account..and..the.."+"Remaining..Balance..is: ");
			return s-a;
		}
	}
	void setUPI(int upi)
	{
		this.upi=upi;
	}
	int getUPI()
	{
		return upi;
	}
	void getDebitno(long debitno)
	{
		if(debitno==this.debitno)
		{
			System.out.println("\t\t\t\t\t\t\t    Now..Enter..CVV..no :");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t    Incorrect..Card..No..Please..Re-enter..again");
			getDebitno(sc.nextLong());
		}
		
	}
	void getcvv(int cvv)
	{
		if(cvv==this.cvv)
		{
			System.out.println("\t\t\t\t\t\t\t    OTP sent Successfully");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t    Incorrect..CVV..No..Please..Re-enter..again");
			getcvv(sc.nextInt());
		}
	}
	float viewBalance(int upi)
	{
		if(upi==this.upi)
		{
			System.out.println("\t\t\t\t\t\t\t    Available Balance is : ");
			return balance;
		}
		
		else
		{
			int v=0;
			int f=(int)wrongPin();	
			if(y==2)
			{
				System.out.println("\t\t\t\t\t\t\t    Enter..the..UPI");
				v=sc.nextInt();
			}
			if(f==v || f==getUPI())
			{
				System.out.println("\t\t\t\t\t\t\t    Available Balance is : ");
				return balance;
			}
			else
			{
				int t=(int)wrongPin();	
				System.out.println("\t\t\t\t\t\t\t    Enter..the..UPI");
				int q=sc.nextInt();
				if(t==q)
				{
					System.out.println("\t\t\t\t\t\t\t    Available Balance is : ");
					return balance;
				}
				else
				{
					return 0;
				}
			}
		}
	}
	float Tomobileno(long mobileno,int upi)
	{
		if(upi!=this.upi)
		{
			System.out.println("\t\t\t\t\t\t\t    Invalid..UPI..number");
		}
		if(upi==this.upi)
		{
			System.out.println("\t\t\t\t\t\t\t    Enter..the..Amount..to..be..transferred");
			float i=sc.nextFloat();
			if(i>balance)
			{
				System.out.println("\t\t\t\t\t\t\t    Insufficient..Balance..in..your..Bank..Account");
				return InsufficientBalance(balance);
			}
			else
			{
				balance=balance-i;
				System.out.println("\t\t\t\t\t\t\t    Transaction..Successful");
				System.out.print("\t\t\t\t\t\t\t    "+i+"..has..been..deduced..from..your bank..account..and..the.."+"Remaining..Balance..is: ");
				return balance;
			}	
			
		}
		else
		{
			
			int v=0;
			int s=(int)wrongPin();	
			if(y==2)
			{
				System.out.println("\t\t\t\t\t\t\t    Enter..the..UPI");
				v=sc.nextInt();
			}
			if(s==v || s==getUPI())
			{
				System.out.println("\t\t\t\t\t\t\t    Enter..the..Amount..to..be..transferred");
				float f=sc.nextFloat();
				if(f>balance)
				{
					System.out.println("\t\t\t\t\t\t\t    Insufficient..Balance..in..your..Bank..Account");
					return InsufficientBalance(balance);
				}
				else
				{
					balance=balance-f;
					System.out.println("\t\t\t\t\t\t\t    Transaction..Successful");
					System.out.print("\t\t\t\t\t\t\t    "+f+"..has..been..deduced..from..your bank..account..and..the.."+"Remaining..Balance..is: ");
					return balance;
				}		
			}
			else
			{
				return wrongPin();
			}
		}
	}
	float ToBank(long acntno,int upi)
	{
		if(upi!=this.upi)
		{
			System.out.println("\t\t\t\t\t\t\t    Invalid..UPI..number");
		}
		if(upi==this.upi)
		{
			System.out.println("\t\t\t\t\t\t\t    Enter..the..Amount..to..be..transferred");
			float i=sc.nextFloat();
			if(i>balance)
			{
				System.out.println("\t\t\t\t\t\t\t    Insufficient..Balance..in..your..Bank..Account");
				return InsufficientBalance(balance);
				
			}
			else
			{
				balance=balance-i;
				System.out.println("\t\t\t\t\t\t\t    Transaction..Successful");
				System.out.print("\t\t\t\t\t\t\t    "+i+"..has..been..deduced..from..your bank..account..and..the.."+"Remaining..Balance..is: ");
				return balance;
			}	
			
		}
		else
		{
			
			int v=0;
			int s=(int)wrongPin();	
			if(y==2)
			{
				System.out.println("\t\t\t\t\t\t\t    Enter..the..UPI");
				v=sc.nextInt();
			}
			if(s==v || s==getUPI())
			{
				System.out.println("\t\t\t\t\t\t\t    Enter..the..Amount..to..be..transferred");
				float f=sc.nextFloat();
				if(f>balance)
				{
					System.out.println("\t\t\t\t\t\t\t    Insufficient..Balance..in..your..Bank..Account");
					return InsufficientBalance(balance);
				}
				else
				{
					balance=balance-f;
					System.out.println("\t\t\t\t\t\t\t    Transaction..Successful");
					System.out.print("\t\t\t\t\t\t\t    "+f+"..has..been..deduced..from..your bank..account..and..the.."+"Remaining..Balance..is: ");
					return balance;
				}		
			
			}
			else
			{
				return wrongPin();
			}
		}
	}
}
class User
{	
	static Scanner sc=new Scanner(System.in);
	static User x=new User();
	void viewBalance()
	{
		display(new User());
		int i=sc.nextInt();
		if(i==1)
		{
			SBI obj=new SBI();
			System.out.println("\t\t\t\t\t\t\t    Enter UPIpin.....");
			System.out.println(obj.viewBalance(sc.nextInt()));
		}
	}
	void Tomobileno()
	{
		display(new User());
		int i=sc.nextInt();
		if(i==1)
		{
			SBI obj=new SBI();
			System.out.println("\t\t\t\t\t\t\t    Enter..your..Mobileno..followed..by..UPIpin ");
			System.out.println(obj.Tomobileno(sc.nextLong(),sc.nextInt()));
		}
	}
	void ToBank()
	{
		display(new User());
		int i=sc.nextInt();
		if(i==1)
		{
			SBI obj=new SBI();
			System.out.println("\t\t\t\t\t\t\t    Enter..your..Acccountnumber..followed..by..UPIpin ");
			System.out.println(obj.ToBank(sc.nextLong(),sc.nextInt()));
		}
	}
	void display(User y)
	{
		System.out.println("\t\t\t\t\t\t\t    Press 1 for SBI bank");
		System.out.println("\t\t\t\t\t\t\t    Press 2 for Kotak bank");
		System.out.println("\t\t\t\t\t\t\t    Press 3 for HDFC bank");
	}
	public static void main(String[]arg)
	{
		
		System.out.println("\t\t\t\t\t\t\t    Welcome to Phonepay");
		System.out.println("\t\t\t\t\t\t\t    Press 0 to View Balance");
		System.out.println("\t\t\t\t\t\t\t    Press 1 to transfer money using Mobileno.");
		System.out.println("\t\t\t\t\t\t\t    Press 2 to transfer money using BankAccount");
		int n=sc.nextInt();
		if(n==0)
		{
			x.viewBalance();
		}
		else if(n==1)
		{
			x.Tomobileno();
		}
		else if(n==2)
		{
			x.ToBank();	
		}
	}

	
}