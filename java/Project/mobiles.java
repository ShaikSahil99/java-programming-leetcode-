package ProjectFinal.electronics.Mobiles;
import test.*;
import java.util.Scanner;
public class mobiles extends displayMobiles
{
	public static Scanner sc=new Scanner(System.in);
	public static String red="\u001B[31m";
	public static String  green   = "\u001B[32m";
	public static String  yellow  = " \u001B[33m";
	public static String  blue    = " \u001B[34m";
	public static String  violet  = " \u001B[35m";
	public static String  skyBlue = " \u001B[36m";
	public static String  white   = " \u001B[37m";
     	public double bill=0;
      	public void prices()
     	{
		System.out.println(yellow+"1-iPhone 15(128GB)_Price : 77,900 \n 2-iPhone 15 Pro Max(256GB)_Price : 1,59,900 \n 3-Samsung Galaxy S23 Ultra 5G(12GB RAM, 256GB Storage)_Price : 1,00,720 \n 4-Samsung Galaxy Z Fold5 5G(12GB RAM, 512GB Storage_Price : 1,64,999 \n 5-OnePlus 11 5G(8GB RAM, 128GB Storage_price : 56,999");
		System.out.println(red+" Select a Mobile to Buy");
     	}
     	public void selection()
     	{
          	prices();
          	int price=sc.nextInt();
          	if(price>=1 && price<=5)
          	{
			
          	       bill=bill+mobile(price);
          	}
          	else
          	System.out.println(red+" Invalid Input");
          	System.out.println(red+" press 1 to buy more mobiles");
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
				user.buyproductsMobiles=true;
                     	 	billing(bill);
               		}
          	}
     }
     public void billing(double bill)                                                                                                 //Billing method
     {
         double tax=bill*0.02;
	user.billTotal+=bill+tax;
         //System.out.println(blue+"Bill = Bill+ Tax : " +bill+"+"+tax);
	//System.out.println(" Total Bill = "+bill+tax);
     }
}