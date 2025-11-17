package test;
import java.time.LocalDateTime;
import java.time.Month;
import ProjectFinal.electronics.laptops.*;
import ProjectFinal.electronics.Mobiles.*;
import ProjectFinal.electronics.Tabs.*;
import ProjectFinal.kitchen.*;
import ProjectFinal.furniture.*;
import java.util.*;
public class user
{
	public static String blink = "\u001B[5m";
        public static String red="\u001B[31m";
	public static String  green   = "\u001B[32m";
	public static String  yellow  = " \u001B[33m";
	public static String  blue    = " \u001B[34m";
	public static String  violet  = " \u001B[35m";
	public static String  skyBlue = " \u001B[36m";
	public static String  white   = " \u001B[37m";
	public static String reset = "\u001B[om";
	public static double billTotal=0;
	public static boolean Kitchenproducts=false;
	public static boolean Furnitureproducts=false;
	public static displayKitchen k=new displayKitchen();
	static displayFurniture f=new displayFurniture();
	static Scanner sc=new Scanner(System.in);
	static String d[]=new String[44];
	static boolean displayElectronics=false;
	static mobiles obj=new mobiles();
	static laptops x=new laptops();
	static tabs obj1=new tabs();
	public static boolean buyproductsMobiles=false;
	public static boolean buyproductslaptops=false;
	public static boolean buyproductstabs=false;
	static boolean kitchenItems=false,furnitureItems=false;
	static void heading()
	{
		d[0]=" ";
		d[1]=" ";
		d[2]=green+"	 ## ##   ###  ##    ##     ### ##    ## ##   ##   ##           #### ##  ### ##   ### ###  ###  ##  ### ##   ";
		d[3]="	##   ##   ##  ##     ##     ##  ##  ##   ##  ##   ##           # ## ##   ##  ##   ##  ##    ## ##  ##  ##   ";
		d[4]=skyBlue+"	####      ##  ##   ## ##    ##  ##  ##   ##  ##   ##             ##      ##  ##   ##       # ## #     ##    ";
		d[5]="	 #####    ## ###   ##  ##   ##  ##  ##   ##  ## # ##             ##      ## ##    ## ##    ## ##     ##     ";
		d[6]="	    ###   ##  ##   ## ###   ##  ##  ##   ##  # ### #             ##      ## ##    ##       ##  ##   ##      ";
		d[7]=violet+"	##   ##   ##  ##   ##  ##   ##  ##  ##   ##   ## ##              ##      ##  ##   ##  ##   ##  ##  ##  ##   ";
		d[8]="	 ## ##   ###  ##  ###  ##  ### ##    ## ##   ##   ##            ####    #### ##  ### ###  ###  ##  # ####   ";
		d[9]=" ";                                                                                                            
		d[10]=" ";
		d[11]="";
		d[12]="";
		d[13]="	###  #   #######  #######   #####   ###  ##  ####     ###  ##           #######  #######  ####     ##   ##   #####   ";
		d[14]="	### ##     ###    #######  ###  ##  ###  ##  ##       ###  ##             ###    #######  ##       ### ###  ###      ";
		d[15]="	#####      ###    #######  ##       ###  ##  #####    #### ##             ###    #######  #####    #######   ##### ";  
		d[16]="	#####      ###      ###    ##   ##  #######  ##       #######             ###      ###    ##       #######      ###  ";
		d[17]="	######     ###      ###    ###  ##  ###  ##  ##       #######             ###      ###    ##       #######      ### ";
		d[18]="	### ###  #######    ###    #######  ###  ##  #######  ### ###           #######    ###    #######  ###  ##  #######  ";
		d[19]="	### ###  #######    ###    #######  ###  ##  #######  ###  ##           #######    ###    #######  ###  ##  #######  ";
		d[20]="	### ###  #######    ###     #####   ###  ##  #######  ###  ##           #######    ###    #######  ###  ##  ######   ";
		d[21]="";
		d[22]="";
		d[23]="";
		d[24]="";
		d[25]="";
		d[26]="### ###  ##  ###  ### ##   ###  ##    ####   #### ##  ##  ###  ### ##   ### ###             ####   #### ##  ### ###  ##   ##   ## ##   ";
		d[27]=" ##  ##  ##   ##   ##  ##    ## ##     ##    # ## ##  ##   ##   ##  ##   ##  ##              ##    # ## ##   ##  ##   ## ##   ##   ##  ";
		d[28]=" ##      ##   ##   ##  ##   # ## #     ##      ##     ##   ##   ##  ##   ##                  ##      ##      ##      # ### #  ####     ";
		d[29]=" ## ##   ##   ##   ## ##    ## ##      ##      ##     ##   ##   ## ##    ## ##               ##      ##      ## ##   ## # ##   #####   ";
		d[30]=" ##      ##   ##   ## ##    ##  ##     ##      ##     ##   ##   ## ##    ##                  ##      ##      ##      ##   ##      ###  ";
		d[31]=" ##      ##   ##   ##  ##   ##  ##     ##      ##     ##   ##   ##  ##   ##  ##              ##      ##      ##  ##  ##   ##  ##   ##  ";
		d[32]="####      ## ##   #### ##  ###  ##    ####    ####     ## ##   #### ##  ### ###             ####    ####    ### ###  ##   ##   ## ##   ";
		d[33]="";
		d[34]="";
		d[35]="                                                            ";
		d[36]="  ,ad8888ba,          db         88888888ba   888888888888  ";
		d[37]=" d8 '    ` 8b        d88b        88       8b       88       ";
		d[38]="d8'                 d8'`8b       88      ,8P       88       ";
		d[39]="88                 d8'  `8b      88aaaaaa8P'       88       ";
		d[40]="88                d8YaaaaY8b     88eeee88'         88       ";
		d[41]="Y8,              d8$$$$$$$$8b    88    `8b         88       ";
		d[42]=" Y8a.    .a8P   d8'        `8b   88     `8b        88       ";
		d[43]="  ` Y8888Y '   d8'          `8b  88      `8b       88       ";                     

	}
	public static void  cart()
	{
		for(int i=34;i<=43;i++)
		{
			if(d[i]!=null)
			{
				System.out.println(blink+red+d[i]);
			}
		}
	}
	static void display()
	{
		for(int i=0;i<11;i++)
		{
			System.out.println(blink+d[i]);
		}
	}
	static void kitchenItems()
	{
		for(int i=11;i<23;i++)
		{
			System.out.println(blue+d[i]);
		}
	}
	static void furnitureItems()
	{
		for(int i=24;i<=34;i++)
		{
			System.out.println(blue+d[i]);
		}
	}
	
                                                                                
	static void billing(double bill)
	{
		//System.out.println("Bill = Bill+ Tax : " +bill+"+"+tax);
		System.out.println(green+" Electronics, Kitchen and Furniture Billings");
		System.out.println(" Total Bill = "+bill);
	}
		
	static void m1()
	{
		if(displayElectronics==true)
		{
			obj.displayElectronics();
			displayElectronics=false;
		}
		System.out.println(yellow+"1.Mobiles \n 2.Laptops\n 3.Tabs \n Otherwise exit ");
		char a=sc.next().charAt(0);
		if(a=='1')
		{	
			obj.display();	
			obj.selection();
			
		}
		else if(a=='2')
		{
			x.display();	
			x.selection();
		}
		else if(a=='3')
		{

			obj1.display();
           		obj1.selection();
		}
		else
          	System.out.println(red+" Invalid Input");
          	System.out.println(red+" press 1 to buy more electronics products");
          	System.out.println(" press any key to exit");
		int c=sc.next().charAt(0);
          	if(c=='1')
          	{
				displayElectronics=true;
                   		m1();
          	}
   	
	}
	public static void m2()
	{
		
		if(kitchenItems==true)
		{
			kitchenItems();
			kitchenItems=false;
		}
		System.out.println("1.Kitchen Products \n Otherwise exit ");
		char a=sc.next().charAt(0);
		if(a=='1')
		{	
			
			k.m1();
			k.display();
			k.selection();
			Kitchenproducts=true;															//display buying products
		}
		else
          	System.out.println(red+" Invalid Input");
          	System.out.println(red+" press 1 to buy more Kitchen products");
          	System.out.println(" press any key to exit");
          	char c=sc.next().charAt(0);
          	if(c=='1')
          	{
				kitchenItems=true;
                   		m2();
          	}
   	}
	public static void m3()
	{
		if(furnitureItems==true)
		{
			furnitureItems();
			furnitureItems=false;
		}
		System.out.println("1.Furniture Products \n Otherwise exit ");
		char a=sc.next().charAt(0);
		if(a=='1')
		{	
			
			f.m1();
			f.display();
			f.selection();
			Furnitureproducts=true;	
		}
		else
          	System.out.println(red+" Invalid Input");
          	System.out.println(red+" press 1 to buy more Furniture products");
          	System.out.println(" press any key to exit");
          	char c=sc.next().charAt(0);
          	if(c=='1')
          	{
				furnitureItems=true;
                   		m3();
          	}
   	}
	public static void userAll()
	{
		
		
		System.out.println(yellow+"Press 1 to buy Electronics \n Press 2 to buy Kitchen \n Press 3 to buy Furniture or otherwise Billing");
		char a=sc.next().charAt(0);
		if(a=='1')
		{
			displayElectronics=true;
			m1();
		}
		else if(a=='2')
		{
			kitchenItems=true;                                                                                                                         //display KItchen only headings
			m2();
		}
		else if(a=='3')
		{
			furnitureItems=true;
			m3();
		}
		else
		System.out.println(red+" Invalid Input");
		System.out.println(blue+"<----Press 1 to display list---->");
		System.out.println(" Press any key to billing");
		char d=sc.next().charAt(0);
		if(d=='1')
		{
			userAll();
		}
		else
		{
			cart();
			if(buyproductsMobiles==true)
			{
				obj.displaybuyingProducts();
			}
			if(buyproductslaptops==true)
			{
				x.buyproducts();
			}
			if( buyproductstabs==true)
			{
				obj1.buyproducttab();
			}
			if(Kitchenproducts==true)
			{
				k.buyKitchen();
			}
			if(Furnitureproducts==true)
			{
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				f.buyFurniture();
			}
		
		
			if(billTotal>0)
			{
				billing(billTotal);
			}
		}
		
	}
	public static void main(String[] args)
	{
		
		heading();
		display();
		while(true)
		{
			if(Projectid.login()==true)
			{
				userAll();
				break;
			}
			else
			{	
				break;
			}

		}
		if(billTotal>0)
		{
			System.out.println(" Press 1 to Pay or otherwise exit");
			char a=sc.next().charAt(0);
			if(a=='1')
			{
				double balance =bank.withdraw(billTotal);
				System.out.println(" Your Total Balance ="+balance);
				 LocalDateTime currTime = LocalDateTime.now();
      			  	System.out.println(white+"current date time: " +currTime);
  				LocalDateTime custDate1 = LocalDateTime.of(2023, 12, 01,  10, 30);
        			System.out.println(" Delivery Date: "+custDate1);
				System.out.println(red+" Order Coming Soon");
			}
			else
			{
				System.out.println(" Thank  you for visiting \n Come again  ");
			}
		}
	}
}
