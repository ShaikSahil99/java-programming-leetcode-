import java.util.Scanner;	
import java.text.SimpleDateFormat;  
import java.util.Date; 
abstract class bus
{
	static Scanner sc=new Scanner(System.in);
	static String def = "\u001B[0m";
	static String blink = "\u001B[5m";
	static String magneta = "\u001B[35m";
	static String green = "\u001B[32m";
	static String yellow = "\u001B[33m";
	static String red = "\u001B[31m";
	static String skblue = "\u001B[36m";
	static int q1=0;
	//static int q2=0;
	static int nseats=0;
	static int availseats =45;
	static int seatno=15;
	static String busno="TS28KA8888";
	static String driver="Ravi Kiran";
	static String number="9100315288";
	static int x1=0;
	static String name1="",name2="",name3="";
	static int age1=0,age2=0,age3=0;
	static int p1=0;
	static int min = 0001;
	static int max = 9999;
	static private int pin1 = 8888;
	int p;
	int getpin1()
	{
		return pin1;
	}
	abstract void ac(int a);
	abstract void nonac(int a);
	void seatSel()
	{
		System.out.print(yellow);
		System.out.println("\t\t\t\t\t\t\t SEATS AVAILABLE - "+availseats);
		System.out.print(def);
		System.out.println();
		System.out.print(red);
		System.out.println("\t\t\t\t\t\t Select Number of seats requried: (MAX -3)");
		System.out.print(def);
		while(true)
		{
			q1=sc.nextInt();
			if(q1<=3 && q1>0)
				break;
			else
				System.out.print("\t\t\t\tMax Seats Limit Crossed Select Below 3:\n\t\t\t\tPlease Select again: ");
		}
		nseats=q1;
		if(q1>0)
		{
			System.out.println("\t\t\t\t\t\t\t No.of Seats Selected "+nseats);
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t Enter Name of  Passenger "+i+": ");						
					name1 = sc.next();
					System.out.print("\t\t\t\t\t\t Enter Age of  Passenger "+i+": ");
					age1 = sc.nextInt();
				}
				if(i==2)
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t Enter Name of  Passenger "+i+": ");	
					name2 = sc.next();
					System.out.print("\t\t\t\t\t\t Enter Age of  Passenger "+i+": ");
					age2= sc.nextInt();
				}
				if(i==3)
				{
					System.out.println();
					System.out.print("\t\t\t\t\t\t Enter Name of  Passenger "+i+": ");	
					name3 = sc.next();
					System.out.print("\t\t\t\t\t\t Enter Age of  Passenger "+i+": ");
					age3 = sc.nextInt();

				}
			}
		}
	}
	void pm()
	{
		System.out.print(skblue);
		System.out.println("\n\t\t\t\t\t\t\t  PAYMENT MODE \n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t\t\t 1.UPI ID \n\t\t\t\t\t\t\t 2.NET BANKING \n\t\t\t\t\t\t\t 3.Credit Card/Debit Card ");
		System.out.print("Enter your choice:");
		//int p = sc.nextInt();
		while(true)
		{
			p=sc.nextInt();
			if(p<=3 && p>0)
				break;
			else
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
				System.out.print(def);
			}
		}
		switch(p)
		{
			case 1 :{	
					System.out.print("\n\t\t\t\t\t\t Enter UPI ID   : ");
					String s = sc.next();
					System.out.print("\t\t\t\t\t\t Enter UPI PIN  : ");
					int pin = sc.nextInt();
					p1=upi(pin);
					break;
				}
			case 2:{
					System.out.print("\t\t\t\t\t\t Enter BANKING ID : ");
					String s1=sc.next();
					System.out.print("\t\t\t\t\t\t Enter PIN        : ");
					int pin1=sc.nextInt();
					p1=upi(pin1);
					break;
				}	
			case 3:{
					System.out.print("\t\t\t\t\t\t Enter CREDIT/DEBIT CARD NUMBER : ");
					String s2=sc.next();
					System.out.print("\t\t\t\t\t\t Enter PIN                      : ");
					int pin2=sc.nextInt();
					p1=upi(pin2);
					break;
				}
			default:{
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t Invalid Choice");
					break;
				}
		}
	}
	int upi(int a)
	{
		if(a==pin1)

			return 1;
		else
			return 0;
	}
	void print(int k,int a,String s,int a1,int pr,int sc,int date,String busno,String driver,String number)
	{
		System.out.println("\t\t\t\t-------------------------------------------------------------------------");
		System.out.println("\n\t\t\t\tTicket No               : "+a);
		System.out.println("\t\t\t\tDate                    : "+date+"-10-2023"); 
		System.out.println("\t\t\t\tSeat Number             : "+sc);
		System.out.println("\t\t\t\tName of Passenger       : "+s);
		System.out.println("\t\t\t\tAge "+"                    : "+a1);
		System.out.println("\t\t\t\tBus No                  : "+busno);
		System.out.println("\t\t\t\tDriver Name             : "+driver);
		System.out.println("\t\t\t\tDriver Phone Number     : "+number);
		System.out.println("\t\t\t\tPick Up Location Remedy Hospital near to KPHP Metro");
		System.out.println("\t\t\t\tTicket Price            : "+pr);	
		System.out.println("\t\t\t\t------------------------------------------------------------------------");
	}
}
class guntur extends bus
{ 
	static int orangeseatprice=1500;
	static int kaveriseatprice=1750;
	static int umaseatprice=2500;
	static int meghaseatprice=550;
	static int jayanthiseatprice=650;
	static int maheshseatprice=750;
	static int ticketno=543240;
	static String red = "\u001B[31m";
	static String def = "\u001B[0m";
	static String blink = "\u001B[5m";
	static String green = "\u001B[32m";
	int x;
	void ac(int a)
	{
		x1=a;
		System.out.print(green);
		System.out.println();
		System.out.println("\t\t\t\t\t\t THE BUSES AVAILABLE ARE\n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t-------------------------------------------------------");
		System.out.println("\t\t\t\t\tS.N0  NAMES          \tTYPES       Price \tTIMINGS");
		System.out.println("\t\t\t\t\t-------------------------------------------------------");
		System.out.println("\t\t\t\t\t 1.   Orange Travels \tSeater      1500  \t10:10");
		System.out.println("\t\t\t\t\t 2.   Kaveri Travels \tSeater      1750  \t10:35");
		System.out.println("\t\t\t\t\t 3.   Uma Travels    \tSleeper     2500  \t11:30\n");
		System.out.print("Enter ur choice :");
		while(true)
		{
			x=sc.nextInt();
			if(x<=3 && x>0)
				break;
			else
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
		}
		switch(x)
		{
			case 1:orange();break;
			case 2:kaveri();break;
			case 3:uma();break;
			default:
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Invalid Choice\n");		
				System.out.print(def);
			}
		}
	}
	void nonac(int a)
	{
		x1=a;
		System.out.print(green);
		System.out.println();
		System.out.println("\t\t\t\t\t\t THE BUSES AVAILABLE ARE\n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t----------------------------------------------------------");
		System.out.println("\t\t\t\t\tS.N0  NAMES            \tTYPES        Price \tTIMINGS");
		System.out.println("\t\t\t\t\t----------------------------------------------------------");
		System.out.println("\t\t\t\t\t 1.   Megha Travels    \tSeater        550  \t 10:20");
		System.out.println("\t\t\t\t\t 2.   Jayanthi Travels \tSeater        650  \t 09:35");
		System.out.println("\t\t\t\t\t 3.   Mahesh Travels   \tSleeper       750  \t 11:00\n");
		System.out.print("Enter ur choice :");
		while(true)
		{
			x=sc.nextInt();
			if(x<=3 && x>0)
				break;
			else
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
		}
		switch(x)
		{
			case 1:megha();break;
			case 2:jayanthi();break;
			case 3:mahesh();break;
			default:
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Invalid Choice\n");		
				System.out.print(def);
			}
		}
	}
	void orange()
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,orangeseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,orangeseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,orangeseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*orangeseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\t Thank You Visit Again!");
				System.out.print(def);
				

			}
			else
			{
				System.out.println();
				System.out.println("\n\t\t\t\t\t\t\t Payment Unsuccessful\n\t\t\t\t\t\t\t Invalid Payment details");	
			}
	}
	void kaveri()											//kaveri method
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,kaveriseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,kaveriseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,kaveriseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*kaveriseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
			{
				System.out.println();
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");		
			}

	}
	void uma()  												//umamethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,umaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,umaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,umaseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*umaseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
			{	System.out.println();
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");	
			}
	}
	void megha()  												//meghamethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,meghaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,meghaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,meghaseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*umaseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
			{
				System.out.println();
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
			}
	}
	void jayanthi()  												//jayanthimethod
	{
			
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,jayanthiseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,jayanthiseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,jayanthiseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*umaseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);

			}
			else
			{
				System.out.println();
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
			}
	}
	void mahesh()  												//umamethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,maheshseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,maheshseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,maheshseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*umaseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
			{
				System.out.println();
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
			}
	}

}
class kurnool extends bus
{
	static int morningstartseatprice=2500;
	static int yoloseatprice=2250;
	static int moonlightseatprice=4500;
	static int nareshseatprice=1250;
	static int poojaseatprice=1300;
	static int lakshmiseatprice=1500;
	static int ticketno=543240;
	static String red = "\u001B[31m";
	static String blink = "\u001B[0m";
	int x;
	void ac(int a)
	{
		x1=a;
		System.out.print(green);
		System.out.println();
		System.out.println("\t\t\t\t\t\t THE BUSES AVAILABLE ARE\n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t---------------------------------------------------------------");
		System.out.println("\t\t\t\t\tS.N0       NAMES            \tTYPES        Price \tTIMINGS");
		System.out.println("\t\t\t\t\t---------------------------------------------------------------");
		System.out.println("\t\t\t\t\t 1.   Morningstart Travels  \tSeater       2500  \t10:10");
		System.out.println("\t\t\t\t\t 2.   Yolo Travels          \tSeater       2250  \t10:35");
		System.out.println("\t\t\t\t\t 3.   Moonlight Travels     \tSleeper      4500  \t11:30\n");
		System.out.print("Enter ur choice :");
		while(true)
		{
			x=sc.nextInt();
			if(x<=3 && x>0)
				break;
			else
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
		}
		switch(x)
		{
			case 1:morningstart();break;
			case 2:yolo();break;
			case 3:moonlight();break;
			default:
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Invalid Choice\n");		
				System.out.print(def);
			}
		}
	}
	void nonac(int a)
	{
		x1=a;
		System.out.print(green);
		System.out.println();
		System.out.println("\t\t\t\t\t\t THE BUSES AVAILABLE ARE\n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println("\t\t\t\t\tS.N0  NAMES             \tTYPES     Price  \tTIMING");
		System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println("\t\t\t\t\t 1.   Naresh Travels    \tSeater    1250   \t10:20");
		System.out.println("\t\t\t\t\t 2.   Pooja Travels     \tSeater    1300   \t09:35");
		System.out.println("\t\t\t\t\t 3.   Lakshmi Travels   \tSleeper   1500   \t11:00\n");
		System.out.print("Enter ur choice :");
		while(true)
		{
			x=sc.nextInt();
			if(x<=3 && x>0)
				break;
			else
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
		}
		switch(x)
		{
			case 1:naresh();break;
			case 2:pooja();break;
			case 3:lakshmi();break;
			default:
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Invalid Choice\n");		
				System.out.print(def);
			}
		}
	}
	void morningstart()  												//morningstartmethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,morningstartseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,morningstartseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,morningstartseatprice,seatno+=1,x1,busno,driver,number);
				}	
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*morningstartseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date));
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def); 


			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
	}
	void yolo()  												//yolomethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{	
					if(i==1)
						print(i,ticketno+=1,name1,age1,yoloseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,yoloseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,yoloseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*yoloseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);

			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");	
	}
	void moonlight()  												//moonlightmethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,moonlightseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,moonlightseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,moonlightseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*moonlightseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date));
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def); 


			}
			else
			{
				System.out.println();
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");		
			}
	}
	void naresh()  												//nareshmethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{	
					if(i==1)
						print(i,ticketno+=1,name1,age1,nareshseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,nareshseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,nareshseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*nareshseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);

			}
			else
			{
				System.out.println();
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t\t Invalid Payment details");
				System.out.print(def);
			}
	}
	void pooja()  												//poojamethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,poojaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,poojaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,poojaseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*poojaseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
			{
				System.out.println();
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");	
			}
	}
	void lakshmi()  												//lakshmimethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,lakshmiseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,lakshmiseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,lakshmiseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*lakshmiseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");	
				
	}
}
class tenali extends bus
{
	static int morningstartseatprice=1500;
	static int orangeseatprice=1650;
	static int moonlightseatprice=2500;
	static int vamsiseatprice=650;
	static int purnaseatprice=800;
	static int sagarseatprice=750;
	static int ticketno=543240;
	static String def = "\u001B[0m";
	static String blink = "\u001B[5m";
	static String red = "\u001B[31m";
	int x;
	void ac(int a)
	{
		x1=a;
		System.out.print(green);
		System.out.println();
		System.out.println("\t\t\t\t\t\t THE BUSES AVAILABLE ARE\n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t\tS.N0    NAMES              \tTYPES       Price \tTIMINGS");
		System.out.println("\t\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t\t 1.   Morningstar Travels  \tSeater      1500  \t10:10");
		System.out.println("\t\t\t\t\t 2.   Orange Travels       \tSeater      1650  \t10:35");
		System.out.println("\t\t\t\t\t 3.   Moonlight Travels    \tSleeper     2500  \t11:30\n");
		System.out.print("Enter ur choice :");
		while(true)
		{
			x=sc.nextInt();
			if(x<=3 && x>0)
				break;
			else
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
		}
		switch(x)
		{
			case 1:morningstart();break;
			case 2:orange();break;
			case 3:moonlight();break;
			default:
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Invalid Choice\n");		
				System.out.print(def);
			}
		}
	}
	void nonac(int a)
	{
		x1=a;
		System.out.print(green);
		System.out.println();
		System.out.println("\t\t\t\t\t\t THE BUSES AVAILABLE ARE\n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t\tS.N0  NAMES          \tTYPES          Price \tTIMINGS");
		System.out.println("\t\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t\t 1.   Vamsi Travels  \tSeater          650  \t10:20");
		System.out.println("\t\t\t\t\t 2.   Purna Travels  \tSeater          800  \t09:35");
		System.out.println("\t\t\t\t\t 3.   Sagar Travels  \tSleeper         750  \t11:00\n");
		System.out.print("Enter ur choice :");
		while(true)
		{
			x=sc.nextInt();
			if(x<=3 && x>0)
				break;
			else
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
		}
		switch(x)
		{
			case 1:vamsi();break;
			case 2:purna();break;
			case 3:sagar();break;
			default:
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Invalid Choice\n");		
				System.out.print(def);
			}
		}
	}
	void morningstart()  												//morningstartmethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,morningstartseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,morningstartseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,morningstartseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*morningstartseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
	}
	void moonlight()  												//moonlightmethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,moonlightseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,moonlightseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,moonlightseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*moonlightseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
	}
	void orange()
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,orangeseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,orangeseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,orangeseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*orangeseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
			{
				System.out.println();
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details\n");	
			}
	}
	void vamsi()
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,vamsiseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
							print(i,ticketno+=1,name2,age2,vamsiseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,vamsiseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\tTotal price of ticket "+(nseats*vamsiseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);


			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");			
	}
	void purna()
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,purnaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,purnaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,purnaseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*purnaseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);

			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");			
	}
	void sagar()
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,sagarseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,sagarseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,sagarseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*sagarseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);

			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");		
	}
}
class vijayawada extends bus
{
	static int morningstartseatprice=1700;
	static int yoloseatprice=1850;
	static int moonlightseatprice=2500;
	static int nareshseatprice=650;
	static int poojaseatprice=700;
	static int lakshmiseatprice=1200;
	static int ticketno=543240;
	static String red = "\u001B[31m";
	static String blink = "\u001B[0m";
	int x;
	void ac(int a)
	{
		x1=a;
		System.out.print(green);
		System.out.println();
		System.out.println("\t\t\t\t\t\t THE BUSES AVAILABLE ARE\n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t\tS.N0  NAMES                  \tTYPES     Price \tTIMINGS");
		System.out.println("\t\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t\t 1.   Morningstart Travels   \tSeater    1700  \t10:10");
		System.out.println("\t\t\t\t\t 2.   Yolo Travels           \tSeater    1850  \t10:35");
		System.out.println("\t\t\t\t\t 3.   Moonlight Travels      \tSleeper   2500  \t11:30\n");
		System.out.print("Enter ur choice :");
		while(true)
		{
			x=sc.nextInt();
			if(x<=3 && x>0)
				break;
			else
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
		}
		switch(x)
		{
			case 1:morningstart();break;
			case 2:yolo();break;
			case 3:moonlight();break;
			default:
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Invalid Choice\n");		
				System.out.print(def);
			}
		}
	}
	void nonac(int a)
	{
		x1=a;
		System.out.print(green);
		System.out.println();
		System.out.println("\t\t\t\t\t\t THE BUSES AVAILABLE ARE\n");
		System.out.print(def);
		System.out.println("\t\t\t\t\t-------------------------------------------------------------");
		System.out.println("\t\t\t\t\tS.N0  NAMES             \tTYPES      Price \tTIMINGS");
		System.out.println("\t\t\t\t\t-------------------------------------------------------------");
		System.out.println("\t\t\t\t\t 1.   Naresh Travels    \tSeater      600  \t10:20");
		System.out.println("\t\t\t\t\t 2.   Pooja Travels     \tSeater      700  \t09:35");
		System.out.println("\t\t\t\t\t 3.   Lakshmi Travels   \tSleeper     1200 \t11:00\n");
		System.out.print("Enter ur choice :");
		while(true)
		{
			x=sc.nextInt();
			if(x<=3 && x>0)
				break;
			else
				System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
		}
		switch(x)
		{
			case 1:naresh();break;
			case 2:pooja();break;
			case 3:lakshmi();break;
			default:
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t\t Invalid Choice\n");		
				System.out.print(def);
			}
		}
	}
	void morningstart()  												//morningstartmethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,morningstartseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,morningstartseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,morningstartseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*morningstartseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);
			}
			//else
				//System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
	}
	void yolo()  												//yolomethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{	
					if(i==1)
						print(i,ticketno+=1,name1,age1,yoloseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,yoloseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,yoloseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*yoloseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);
			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");	
	}
	void moonlight()  												//moonlightmethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,moonlightseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,moonlightseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,moonlightseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*moonlightseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);
			}
			else
			{
				System.out.println();
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");	
				System.out.print(def);
			}
	}
	void naresh()  												//nareshmethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{	
					if(i==1)
						print(i,ticketno+=1,name1,age1,nareshseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,nareshseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,nareshseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*nareshseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);
			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
	}
	void pooja()  												//poojamethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,poojaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,poojaseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,poojaseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*poojaseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date));
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);
			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");
	}
	void lakshmi()  												//lakshmimethod
	{
			seatSel();
			pm();
			if(p1==1)
			{
				for(int i=1;i<=nseats;i++)
				{
					if(i==1)
						print(i,ticketno+=1,name1,age1,lakshmiseatprice,seatno+=1,x1,busno,driver,number);
					if(i==2)
						print(i,ticketno+=1,name2,age2,lakshmiseatprice,seatno+=1,x1,busno,driver,number);
					if(i==3)
						print(i,ticketno+=1,name3,age3,lakshmiseatprice,seatno+=1,x1,busno,driver,number);
				}
				System.out.print(green);
				System.out.println("\n\t\t\t\t\t\t Payment Successful ");
				System.out.print(def);
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*lakshmiseatprice));
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    				SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();  
    				System.out.println("\t\t\t\tBooking Date : " + formatter1.format(date));
				System.out.println("\t\t\t\tBookimg time : " + formatter2.format(date)); 
				System.out.print(skblue);
				System.out.println("\n\n\t\t\t\t\t\t\t  HAPPY JOURNEY.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("\n\t\t\t\t\t\t\tThank You Visit Again!");
				System.out.print(def);	
			}
			else
				System.out.println("\t\t\t\t\t\t Payment Unsuccessful\n \t\t\t\t\t\t Invalid Payment details");	
				
	}
}
class test 
{
	static Scanner sc=new Scanner(System.in);
	static String def = "\u001B[0m";
	static String blink = "\u001B[6m";
	static String blue = "\u001B[34m";
	static String yellow = "\u001B[33m";
	static String skblue = "\u001B[36m";
	static String red = "\u001B[31m";
	static String green = "\u001B[32m";
	private String n = "Sahil";
	private String a = "1234";
	void Create(String n,String a)
	{
		this.n=n;
		this.a=a;
	}	
	String getN()
	{
		return n;
	}
	
	String getA()
	{
		return a;
	}
	void display(bus obj )
	{
		System.out.println("\t\t\t\t\t\tChoose your pereferred date in October ");
		System.out.println("\t\t\t\t\t\t1 2  3  4  5  6  7  8  9 10");
		System.out.println("\t\t\t\t\t\t11 12 13 14 15 16 17 18 19");
		System.out.println("\t\t\t\t\t\t20 21 22 23 24 25 26 27 28");
		System.out.println("\t\t\t\t\t\t29 30 31");
		System.out.println("Enter the date:");
		int date;
		while(true)
		{
			
			date=sc.nextInt();
			if(date>=1)
				break;
			else
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.print("\t\t\t\t\t\t Invalid Date Please Select Again!! ");
				System.out.print(def);
			}
		}
		int x;
		if(date>=1 && date<=31)
		{
			System.out.println("\t\t\t\t\t\t Choose your preferred Bus");
			System.out.println();
			System.out.println("\t\t\t\t\t\t 1. A.C or 2. NONA.C");
			System.out.print("Enter your choice:");
			while(true)
			{
				x=sc.nextInt();
				System.out.print("\t\t\t\t\t\t\tLoading");
				try
				{
					for(int i = 1;i<=5;i++)
					{	
						Thread.sleep(1000);
						System.out.print(". ");
					}
				}
	
				catch(Exception e)	
				{}
				if(x<=2 && x>0)
					break;
				else
				{
					System.out.print(blink);
					System.out.print(red);
					System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
					System.out.print(def);
				}
			}
			switch(x)
			{
				case 1: obj.ac(date);break;
				case 2: obj.nonac(date);break;	
				default:
				{
					System.out.print(red);
					System.out.println("\t\t\t\t\t\t Invalid Choice");
					System.out.print(def);
				}
			}
		}
		else
		{
			System.out.print(red);
			System.out.print("\t\t\t\t\t\t\tInvalid Range Date");
			System.out.print(def);
		}
	}
	public static void main(String []args)
	{
		System.out.print(blink);
		System.out.print(blue);
		System.out.println();
		System.out.println("\t\t\t\t\t************************************************");
		System.out.println();
		System.out.println("\t\t\t\t\t***** WELCOME TO ONLINE BUS TICKET BOOKING *****\n");
		System.out.println("\t\t\t\t\t************************************************");
		System.out.print(def);
		System.out.println();
		System.out.print("\t\t\t\t\t\t\tLoading");
		try
		{
		for(int i = 1;i<=5;i++)
		{	
			Thread.sleep(1000);
			System.out.print(". ");
		}
		}
	
		catch(Exception e)	
		{}
		System.out.println();
		System.out.print(def);
		test obj = new test();
		System.out.println();
		System.out.print(yellow);
		System.out.println("\t\t\t\t\t\t CREATE AN NEW USER ACCOUNT \n");
		System.out.print(def);
		System.out.print("\t\t\t\t\t\t Enter your name         : ");
		String z=sc.next();
		System.out.println();
		System.out.print("\t\t\t\t\t\t Enter your new password : ");
		String p=sc.next();
		System.out.println();
		System.out.print("\t\t\t\t\t\t\tLoading");
		try
		{
		for(int i = 1;i<=5;i++)
		{	
			Thread.sleep(1000);
			System.out.print(". ");
		}
		}
	
		catch(Exception e)	
		{}
		
		obj.Create(z,p);
		System.out.println();
		System.out.print(skblue);
		System.out.println("\t\t\t\t\t      ACCOUNT HAS BEEN CREATED SUCCESSFULLY\n");
		System.out.print(def);
		System.out.print(red);
		System.out.println("\t\t\t\t\t**** RED BUS TICKET BOOKING USER LOGIN PAGE ****\n");
		System.out.print(def);
		while(true)
		{
			System.out.print("\t\t\t\t\t\t Login Id : ");
			String x = sc.next();
			System.out.println();
			if(x.equals(obj.getN()))
		    {
				while(true)
				{
					System.out.print("\t\t\t\t\t\t Password : ");
					String y = sc.next();
					System.out.println();
					System.out.print("\t\t\t\t\t\t\tLoading");
					try
					{
						for(int i = 1;i<=5;i++)
						{	
						Thread.sleep(1000);
						System.out.print(". ");
						}
					}
	
					catch(Exception e)	
					{}
				
			   		 if(y.equals(obj.getA()))
			    		{
						if(x.equals(obj.getN())&&y.equals(obj.getA()))
						{
							System.out.println();
							System.out.print(blink);
							System.out.print(green);
							System.out.println("\n\t\t\t\t\t **** WELCOME TO RED BUS TICKET RESERVATION ****\n");
							System.out.print(def);
							test obj1=new test();
							guntur obj2=new guntur();
							kurnool obj3=new kurnool();
							tenali obj4=new tenali();
							vijayawada obj5 = new vijayawada();
							System.out.print(yellow);
							System.out.print("\t\t\t\t\t\t\tLoading");
							try
							{
								for(int i = 1;i<=5;i++)
								{	
									Thread.sleep(1000);
									System.out.print(". ");
								}
							}
	
							catch(Exception e)	
							{}
							System.out.println();System.out.println();
							System.out.println("\t\t\t\t\t---- THE BUSES TRAVELLING FROM HYDERABAD ----\n");
							System.out.print(def);
							System.out.println("\t\t\t\t\t\t    1. Hyderabad - Guntur");
							System.out.println("\t\t\t\t\t\t    2. Hyderabad - Kurnool");
							System.out.println("\t\t\t\t\t\t    3. Hyderabad - Tenali");
							System.out.println("\t\t\t\t\t\t    4. Hyderabad - Vijayawada");
							System.out.println("Enter your choice:");
							int x1;
							while(true)
							{
								x1=sc.nextInt();
								if(x1<=4 && x1>0)
									break;
								else
								{
									System.out.print("\t\t\t\t\t\t\tLoading");
									try
									{
										for(int i = 1;i<=5;i++)
										{	
											Thread.sleep(1000);
											System.out.print(". ");
										}
									}
	
									catch(Exception e)	
									{}
									System.out.println();
									System.out.print(blink);
									System.out.print(red);
									System.out.print("\t\t\t\t\t\t Invalid Choice Please Select Again!!");
									System.out.print(def);
								}
							}
							switch(x1)
							{
								case 1:
									obj1.display(obj2);break;
								case 2:
									obj1.display(obj3);break;
					
								case 3:
									obj1.display(obj4);break;
								case 4:
									obj1.display(obj5);break;
								default:
								{
									System.out.print(blink);
									System.out.print(red);
									System.out.print("\t\t\t\t\t\t\t Invalid Choice");
									System.out.print(def);
								}
							}
						}
					break;
				    }
					else
					{
						System.out.println();
						System.out.print(blink);
						System.out.print(red);
						System.out.println();
						System.out.println("\t\t\t\t\t\t Invalid Password...Please Enter Again!!");
						System.out.print(def);
					}	
				}
			break;
			}
			else
			{
				System.out.print(blink);
				System.out.print(red);
				System.out.println("\t\t\t\t\t\t Invalid UserName...Please Enter Again!!");
				System.out.print(def);
			}
		}
	}
}
		
	