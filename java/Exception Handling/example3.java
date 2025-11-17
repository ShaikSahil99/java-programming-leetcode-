import java.util.Scanner;
class B
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        String a[]={"HI Mama","10","20"};
	int b=0;
	for(int i=0;i<=a.length;i++)
	{
		try
		{	
			int k=Integer.parseInt(a[i]);
			System.out.print(k/b);
		}
		catch(NumberFormatException obj)
		{
			System.out.println("Thappu ra reyy");
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Numbers Chusukora reyy");
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Array Size Chusukoo ra babu");
		}
	}
    }
}
      