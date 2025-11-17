import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	     String RESET  = "\u001B[0m";       //we have colors in 1 - bold 5 blink and varieties ,21 for underline and then 30 to 37 normal colors
	                                        //101-107 bckground colors
         String BLACK  = "\u001B[30m";
         String RED    = "\u001B[31m";
         String GREEN  = "\u001B[32m";
         String YELLOW = "\u001B[33m";
         String BLUE   = "\u001B[34m";
         String PURPLE = "\u001B[35m";
         String CYAN   = "\u001B[36m";
         String WHITE  = "\u001B[37m";
         String backred="\u001B[101m";
         String backGREEN="\u001B[102m";
         String backYELLOW="\u001B[103m";
         String backBLUE="\u001B[104m";
         String backPURPLE="\u001B[105m";
         String bacKCYAN="\u001B[106m";
         String backWHITE="\u001B[107m";
         String ul="\u001B[21m";
         String blink="\u001B[5m";
         String bold="\u001B[1m";
	
	System.out.println(BLUE+blink+ul+"\t\t\t\t\tpay"+RESET+blink+"tm"+RESET);
	System.out.print("\t\t\tLoading");
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
	

}
}
