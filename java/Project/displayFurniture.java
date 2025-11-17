package ProjectFinal.furniture;
import java.text.*;
public  class displayFurniture implements furniture
{
	public static double bill=0.0;
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
				//buyproductDisplay(buying);
				billing(bill);
			}
		}
	}
	public  void buyFurniture()
	{
		buyproductDisplay(buying);
	}
	public static void display()                                                      // displaying the Product Images
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=1;i<100;i++)
		{
			if(a[400+i]!=null &&a[200+i]!=null &&a[600+i]!=null &&a[100+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(skyBlue+a[400+i]+"\t\t"+violet+a[200+i]+"\t\t\t\t\t"+yellow+a[600+i]+"\t\t\t\t\t\t\t"+green+a[100+i]);
				}
				catch(Exception e){}
			}
			else if(a[400+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(skyBlue+a[400+i]);
				}
				catch(Exception e){}
			}
		
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=1;i<100;i++)
		{
			if(a[700+i]!=null && a[300+i]!=null && a[i]!=null && a[500+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(violet+a[700+i]+"\t\t\t"+blue+a[300+i]+"\t\t\t\t\t\t"+white+a[i]+"\t\t\t\t\t\t"+red+a[500+i]);
				}
				catch(Exception e){}
			}
			else if(a[700+i]!=null && a[300+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(violet+a[700+i]+"\t\t\t"+blue+a[300+i]);//+"\t\t\t\t\t\t"+a[i]);
				}
				catch(Exception e){}
			}
			else if(a[700+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(violet+a[700+i]);
				}
				catch(Exception e){}
			}
		}	   
	}
	public void buyproductDisplay(String b[])
	{
		
		for(int i=1 ;i<100;i++)
		{
			if(b[i]!=null)
			{
		  		if(b[i].equals("Hydraulic Bed"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[600+j]!=null)
						{
							System.out.println(green+a[600+j]);
						}
					}
					System.out.println();
					System.out.println();
					System.out.println();
				}
				else if(b[i].equals("Dressing Table"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+200]!=null)
						System.out.println(skyBlue+a[j+200]);
					}
					System.out.println();
					System.out.println();
					System.out.println();

				}
				else if(b[i].equals("Sofa Set"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+400]!=null)
						System.out.println(white+a[j+400]);
					}
					System.out.println();
					System.out.println();
					System.out.println();

				}
				else if(b[i].equals("Recliners"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+100]!=null)
						System.out.println(blue+a[j+100]);
					}
					System.out.println();
					System.out.println();
					System.out.println();

				}
				else if(b[i].equals("Coffee Table"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+500]!=null)
						System.out.println(green+a[j+500]);
					}
					System.out.println();
					System.out.println();
					System.out.println();

				}
				else if(b[i].equals("Dining Table"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+700]!=null)
						System.out.println(red+a[j+700]);
					}
					System.out.println();
					System.out.println();
					System.out.println();

				}
				else if(b[i].equals("Relax chair"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j]!=null)
						System.out.println(yellow+a[j]);
					}
					System.out.println();
					System.out.println();
					System.out.println();

				}
				else if(b[i].equals("Bookcase"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+300]!=null)
						System.out.println(violet+a[j+300]);
					}
					System.out.println();
					System.out.println();
					System.out.println();

				}
			}
			else
			{
				continue;
			} 
			
		}
	}

		
}
