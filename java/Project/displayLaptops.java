package ProjectFinal.electronics.laptops;
import java.util.Scanner;
public class displayLaptops
{
	public static Scanner sc=new Scanner(System.in);
	public static String n[]=new String[50];
	public static String bold="\u001B[1m";
	public static String blink="\u001B[5m";
	public static String reset="\u001B[0m";
	public static String red="\u001B[31m";
	public static String  green   = "\u001B[32m";
	public static String  yellow  = " \u001B[33m";
	public static String  blue    = " \u001B[34m";
	public static String  violet  = " \u001B[35m";
	public static String  skyBlue = " \u001B[36m";
	public static String  white   = " \u001B[37m";
        public static String black    =" \u001B[30m";
	public void display()
   {
         n[0]    ="         ##        ####    #####    ######    ####    #####     ####                      ";
         n[1]    ="         ##       ##  ##   ##  ##     ##     ##  ##   ##  ##   ##  ##                     ";
         n[2]    ="         ##       ##  ##   ##  ##     ##     ##  ##   ##  ##   ##                         ";
         n[3]    ="         ##       ######   #####      ##     ##  ##   #####     ####                      ";
         n[4]    ="         ##       ##  ##   ##         ##     ##  ##   ##           ##                     ";
         n[5]    ="         ##       ##  ##   ##         ##     ##  ##   ##       ##  ##                     ";
         n[6]    ="         ######   ##  ##   ##         ##      ####    ##         ###                      ";
         n[7]    =green+"     *******************************************************************                  ";
         n[8]    =green+"     *******************************************************************                  ";
         n[9]    =" 																						  ";
	 n[10]    =skyBlue+"	                                            .:-=+*:                    ";                   
	 n[11]    ="	                                  .::-=+*##**++==*       ";                                
	 n[12]    ="	                          .:-=++*##**++=--::::::::*     ";                                  
	 n[13]    ="	                  .::-=+*##**+=--:::::::::::::::::+:      ";                                
	 n[14]    ="	         ..:-==+*#**+==--:.......:::::::::::::::::=-      ";                                
	 n[15]    ="	     =+*#**++==-::::...........:-------:::::::::::-+       ";                               
	 n[16]    ="	     #+-:::::::::::..........::::::-=-==:::::::::::*         ";                      
	 n[17]    ="	     ++:::::::::::..........:::::::::.===::::::::::+         ";                   
 	 n[18]    ="	     -#::::::::::............         =++.:::::::::=-          ";            
	 n[19]    ="	     .#=::::::::.......:            . -*+..::::::::-+              ";       
	 n[20]    ="	      #+:::::::......:--      . . .   :#-:-:::::::::*               ";    
	 n[21]    ="	      =#:::::::.....:---. . . . .  . ..#*#***=::::::*.         ";       
	 n[22]    ="	      :#-:::::....::--::. : . .. . - . *##%##*+:::::+-   	";                                 
	 n[23]    ="	       #=:::::.....:::.:- .... . . .   =#**##*+-::::-+           ";                         
	 n[24]    ="	       +*:::::....:--::-=...       ..  .*#*#%#*-:::::#             ";                       
	 n[25]    ="	       :#:::::...::::::-=: ...   ....   *==+##=::::::*.                 ";                  
	 n[26]    ="	        #-::::....:-:-=+*+ :..    ...   -+##*=:....:-*-                   ";                
	 n[27]    ="	        ++:::......:-=+++= ....   .   . -++=::-=*#%%%%=        ";                           
	 n[28]    ="	        -#:::.....:-==++=:.       .::::::=+#%%%%%%%%###*+=-:.     ";                        
	 n[29]    ="	        .%-::....::--=+++=- :..:::-=+*#%%%%%%%%########*#*##**+=-:.  ";                     
	 n[30]    ="	         #+::.....:---=++=-::-=*##*%%%%%%#################***#**#***++=-:.    ";            
	 n[31]    ="	         +#:::......::.:-+*%%%%%%%%%############%###########****#*##*******+=-:.  ";        
	 n[32]    ="	         :%-:... .:=+#%%%%%%%%%############%%#############*##*##*****************+=-:     ";
	 n[33]    ="	          #=:-+*%%%%%%%%%##########%##%%#%################************************+=: ";     
	 n[34]    ="	          +%%%%%%%%%############%%##%##%##%%############**********************+-:      ";
	 n[35]    ="	          :%%%%############%%##%##%##%###############*********************=-:             ";
	 n[36]    ="	           *#######%#%%#%%##%%#######################*****************=-.                 ";
	 n[37]    ="	             .-=*#######%########%###*###############************+=:.                     ";
	 n[38]    ="	                  .-=*###########%####################*******+-:                          ";
	 n[39]    ="	                       .-=+#########################*****=:.                              ";
	 n[40]    ="	                            .-=*###################**=:                                   ";
	 n[41]    ="	                                 .:=+*#########*+=:                                       ";
	 n[42]    ="	                                       :-=++=-.                                           ";
	 n[43]    =" 																											";
	 n[44]    ="																										 ";

	 	

     for(int i=0;i<7;i++)
		{
			System.out.println(blue+n[i]);
		}
		for(int i=7;i<9;i++)
		{
			System.out.println(white+n[i]);
		}
            for(int i=9;i<42;i++)
           {
            System.out.println(skyBlue+n[i]);
}
}
public void buyproducts()
{
		for(int i=9;i<=44;i++)
			{
				System.out.println(skyBlue+n[i]);
			}
		//Sytem.out.println(bold+yellow+"                                                                  Laptop");
}
public double laptop(int price)
     {
          	if(price==1 )
          	{
		 System.out.println("		HP Chromebook");
		 System.out.println("		Brand:-HP");
		 System.out.println("		Colour:-Mineral Silver");
		 System.out.println("		RAM & Storage:-8 GB, 512SSD");
		 System.out.println("		Processor:-Intel i5");
		 System.out.println("		Graphis:-Integrated");
        	 return price=44999;
          	}
        else if(price==2)
        {
		 System.out.println("		Dell Inspiron");
		 System.out.println("		Brand:-DELL");
		 System.out.println("		Colour:-Silver");
		 System.out.println("		RAM & Storage:-16 GB, 1 TB SSD");
		 System.out.println("		Processor:-Intel i7");
		 System.out.println("		Graphis:-Intel Iris Xe");
		 return price=89999;
        }
        else if(price==3)
        {
		 System.out.println("		Asus Vivobook");
		 System.out.println("		Brand:-ASUS");
		 System.out.println("		Colour:-Metalic Black");
		 System.out.println("		RAM & Storage:-16 GB, 1 TB SSD");
		 System.out.println("		Processor:-Intel i7");
		 System.out.println("		Graphis:-GDDR6 4GB");
		 return price=70990;
        }
        else if(price==4)
        {
		 System.out.println("		Acer Nitro 5");
		 System.out.println("		Brand:-ACER");
		 System.out.println("		Colour:-Black");
		 System.out.println("		RAM & Storage:-16 GB, 512 GB SSD");
		 System.out.println("		Processor:-RYZEN 5");
		 System.out.println("		Graphis:-NVIDIA GE FORCE GTX");
		 return price=64999;
        }
        else if(price==5)
        {
		 System.out.println("		Apple Macbook Pro");
		 System.out.println("		Brand:-Apple");
		 System.out.println("		Colour:-Space Black");
		 System.out.println("		RAM & Storage:-36 GB, 512 GB SSD");
		 System.out.println("		Processor:-Apple M3 Pro Chip");
		 System.out.println("		Graphis:-Integrated");
		 return price=189900;
        }
           	return 0;	
     }
}
