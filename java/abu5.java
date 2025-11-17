import java.util.Scanner;
class A
{
    static Scanner sc=new Scanner(System.in);
     int m1(int n)
     {
      		System.out.println(n);
      		return n+n;
      }
      public static void main(String[]args)
      {
      	A obj = new A();
      	int a=sc.nextInt();
      	System.out.print(obj.m1(a));
       }
}
      
      