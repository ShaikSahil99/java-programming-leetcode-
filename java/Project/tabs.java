package ProjectFinal.electronics.Tabs;
import test.*;
public class tabs extends displayTabs
{
     public double bill=0;
      public void prices()
     {
           System.out.println(yellow+"1-Lenovo M8 HD Tablets_price : 6830");
           System.out.println(" 2-Samsung Galaxy Tab S8_Price : 56999");
           System.out.println(" 3-Samsung Galaxy Tab S6_Price : 23999");
     }
    public void selection()
     {
          prices();
          System.out.println(yellow+"select your tabs");
          int price=sc.nextInt();
          if(price>=1 && price<=3)
          {
                 bill=bill+tab(price);
          }
          else
          System.out.println(red+"Invalid Input");
          System.out.println(" press 1 to buy more tabs");
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
			user.buyproductstabs=true;
                      billing(bill);
               }
          }
     }
     public void billing(double bill)                                                                                                       //Billing method 
     {
         double tax=bill*0.02;
	 user.billTotal+=bill+tax;
        // System.out.println(skyBlue+"total bill = "+(bill+tax));
     }
}