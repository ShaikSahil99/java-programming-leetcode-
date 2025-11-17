import java.util.Scanner;
class add
{
	String area;
	String landmark;
	int H_no;
	long pincode;
	add(String a,String b,int c,long d)
	{
		area=a;
		landmark=b;
		H_no=c;
		pincode=d;
		System.out.println("area :"+area);	
		System.out.println("landmark :"+landmark);	
		System.out.println("H_no :"+H_no);	
		System.out.println("pincode :"+pincode);	
	}
	add(add x)
	{
		System.out.println("area :"+x.area);	
		System.out.println("landmark :"+x.landmark);	
		System.out.println("H_no :"+x.H_no);	
		System.out.println("pincode :"+x.pincode);
	}

	public static void main(String[]args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Temporary adress is :");
	add obj=new add(sc.next(),sc.next(),sc.nextInt(),sc.nextLong());
	System.out.println("Is both temp and permanant address same  :");
	boolean b=sc.nextBoolean();
	if(b==true)
	{
		System.out.println("Permanant address is : ");
		new add(obj);
		
	}
	else
	{
		System.out.println("Permanant address is : ");
		new add(sc.next(),sc.next(),sc.nextInt(),sc.nextLong());

	}
	
	}
}