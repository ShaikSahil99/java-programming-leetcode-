package ProjectFinal;
import ProjectFinal.furniture.*;
public class userFurniture extends displayFurniture
{
	public void selection()                                                                   //Selection method
	{
		productList();
		System.out.println(blue+"Press between 1 to 8 or else Invalid Values");
		int key = sc.nextInt();
		if(1<=key && key<=8)
		{
			bill = bill + furniturePrice(key);
		}
		else System.out.println(red+"Invalid Values");
		System.out.println(" press 1 to buy more furniture Products");
		System.out.println(" press any to billing");
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
		
		userFurniture x=new userFurniture();
		x.m1();
		x.display();
		x.selection();		
	}
}