import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	A(int n)
	{
		System.out.println("hi");
		System.out.println(n+" "+this.n);
		
	} 
	A(int b,int c)
	{
		System.out.println("hiuu");
	} 
	public static void main(String[]args)
	{
	new A(sc.nextInt());
	}
}
    