package ProjectFinal.kitchen;
import java.text.*;
public  class displayKitchen implements kitchen
{
	public static double bill=0.0;
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
		int u=sc.nextInt();
		if(u==1)
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
	public  void buyKitchen()
	{
		buyproductDisplay(buying);
	}
	public static void display()                                                      // dispaying the Product Images
	{
		for(int i=1;i<100;i++)
		{
			if(a[600+i]!=null && a[200+i]!=null && a[400+i]!=null && a[100+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(a[600+i]+"\t\t"+a[200+i]+"\t\t"+a[400+i]+"\t"+a[100+i]);
				}
				catch(Exception e){}
			}
			else if(a[600+i]!=null && a[200+i]!=null && a[400+i]!=null )
			{
				try{
				Thread.sleep(600);
				System.out.println(a[600+i]+"\t\t"+a[200+i]+"\t\t"+a[400+i]);
				}
				catch(Exception e){}
			}
			else if(a[600+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(a[600+i]);
				}
				catch(Exception e){}
			}
		
		}
		for(int i=1;i<100;i++)
		{
			if(a[500+i]!=null && a[700+i]!=null && a[i]!=null && a[300+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(a[500+i]+"\t\t\t"+a[700+i]+"\t\t\t\t\t\t"+a[i]+"\t\t\t\t\t\t"+a[300+i]);
				}
				catch(Exception e){}
			}
			else if(a[500+i]!=null && a[700+i]!=null && a[i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(a[500+i]+"\t\t\t"+a[700+i]+"\t\t\t\t\t\t"+a[i]);
				}
				catch(Exception e){}

			}
			else if(a[500+i]!=null)
			{
				try{
				Thread.sleep(600);
				System.out.println(a[500+i]);
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
		  		if(b[i].equals("Knife"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[600+j]!=null && (j<=1 && j<=15))
						{
							System.out.println(red+a[600+j]);
						}
						else if(a[600+j]!=null && (j<=16 && j<=34))
						{
							System.out.println(blue+a[600+j]);
						}
						else if(a[600+j]!=null)
						{
							System.out.println(yellow+a[600+j]);
						}


					}
				}
				else if(b[i].equals("Steel Plates"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+200]!=null && (j<=1 && j<=15))
						{
							System.out.println(red+a[200+j]);
						}
						else if(a[j+200]!=null && (j<=16 && j<=34))
						{
							System.out.println(blue+a[200+j]);
						}
						else if(a[j+200]!=null)
						{
							System.out.println(yellow+a[j+200]);
						}
					}
				}
				else if(b[i].equals("Raga Fry Pan"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+400]!=null && (j<=1 && j<=15))
						{
							System.out.println(red+a[j+400]);
						}
						else if(a[j+400]!=null && (j<=16 && j<=34))
						{
							System.out.println(blue+a[j+400]);
						}
						else if(a[j+400]!=null)
						System.out.println(yellow+a[j+400]);
					}
				}
				else if(b[i].equals("Spoon"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+100]!=null && (j<=1 && j<=15))
						{
							System.out.println(red+a[j+100]);
						}
						else if(a[j+100]!=null && (j<=16 && j<=34))
						{
							System.out.println(blue+a[j+100]);
						}
						else if(a[j+100]!=null)
						System.out.println(yellow+a[j+100]);
					}
				}
				else if(b[i].equals("Tea Flask"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+500]!=null && (j<=1 && j<=6))
						{
							System.out.println(red+a[j+500]);
						}
						else if(a[j+500]!=null && (j<=7 && j<=14))
						{
							System.out.println(green+a[j+500]);
						}
						else if(a[j+500]!=null)
						System.out.println(yellow+a[j+500]);
					}
				}
				else if(b[i].equals("Mixer"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+700]!=null && (j<=1 && j<=6))
						{
							System.out.println(red+a[j+700]);
						}
						else if(a[i+700]!=null && (j<=7 && j<=14))
						{
							System.out.println(green+a[j+700]);
						}
						else if(a[j+700]!=null)
						System.out.println(yellow+a[j+700]);
					}
				}
				else if(b[i].equals("Bottle"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j]!=null && (j<=1 && j<=6))
						{
							System.out.println(red+a[j]);
						}
						else if(a[j]!=null && (j<=7 && j<=14))
						{
							System.out.println(green+a[j]);
						}
						else if(a[j]!=null)
						System.out.println(yellow+a[j]);
					}
				}
				else if(b[i].equals("Cooker"))
				{
					for(int j=1;j<100;j++)
					{
						if(a[j+300]!=null && (j<=1 && j<=6))
						{
							System.out.println(red+a[j+300]);
						}
						else if(a[j+300]!=null && (j<=7 && j<=14))
						{
							System.out.println(green+a[j+300]);
						}
						else if(a[j+300]!=null)
						System.out.println(a[j+300]);
					}
				}
			}
			else
			{
				continue;
			} 
			
		}
	}

		
}
