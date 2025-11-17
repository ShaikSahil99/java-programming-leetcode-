package ProjectFinal.electronics.laptops;
import test.*;
import java.util.Scanner;
public class laptops extends displayLaptops
{
	public static Scanner sc=new Scanner(System.in);
	public static String red="\u001B[31m";
        public static String black  ="\u001B[31m";
	public static String  green   = "\u001B[32m";
	public static String  yellow  = " \u001B[33m";
	public static String  blue    = " \u001B[34m";
	public static String  violet  = " \u001B[35m";
	public static String  skyBlue = " \u001B[36m";
	public static String  white   = " \u001B[37m";
     	public double bill=0;
      	public void prices()
     	{
		System.out.println(yellow+"1-HP Chromebook_price : 44,999\n 2-Dell Inspiron_price : 89,999\n 3-Asus Vivobook_price : 70,990\n 4-Acer Nitro5_price : 64,999\n 5-Apple MacBook Pro_price : 1,89,900");
		System.out.println(violet+" Select a laptop to Buy");
     	}
     	public void selection()
     	{
          	prices();
          	int price=sc.nextInt();
          	if(price>=1 && price<=5)
          	{
			
          	       bill=bill+laptop(price);
          	}

          	else
          	System.out.println(red+" Invalid Input");
          	System.out.println(red+" press 1 to buy more laptops");
          	System.out.println(" press any key to billing");
          	char c=sc.next().charAt(0);
          	if(c=='1')
          	{
                   		selection();
          	}
          	else
      	   	{
               		if(bill>0)
               		{
				user.buyproductslaptops=true;
                     	 	billing(bill);
               		}
          	}
     }
     public void billing(double bill)                                                                                              //Billing method
     {
         double tax=bill*0.02;
	 user.billTotal+=bill+tax;
	
         //System.out.println(blue+"Bill = Bill+ Tax : " +bill+"+"+tax);
	//System.out.println(" Total Bill = "+bill+tax);
     }
}