package ProjectFinal;
import ProjectFinal.kitchen.*;
public class userKitchen extends displayKitchen
{
	public void selection()                                                                   //Selection method
	{
		productList();
		System.out.println(blue+"Press between 1 to 8 or else Invalid Values");
		int key = sc.nextInt();
		if(1<=key && key<=8)
		{
			bill = bill + kitchenPrice(key);
		}
		else System.out.println(red+"Invalid Values");
		System.out.println(" press 1 to buy more kitchen Products");
		System.out.println(" press any key to billing");
		char u=sc.next().charAt(0);
		if(u=='1')
		{
			selection();
		}
		else
		{
			if(bill>0)
			{
				buyproductDisplay(buying);
				billing(bill);
			}
		}
	}
	public static void main(String[] args)                                                        //Main method
	{
		
		userKitchen x=new userKitchen();
		x.m1();
		x.display();
		x.selection();		
	}
}