import java.util.Scanner;
class B
{
    static Scanner sc=new Scanner(System.in);
      int add(int a,int b)
     {
		return a+b;
      }
     int sub(int a,int b)
      {
		return a-b;
	}
     int multi()
      {         
		
		return add(sc.nextInt(),sc.nextInt())*sub(sc.nextInt(),sc.nextInt());
	}
	
      public static void main(String[]args)
      {
      	B obj= new B();
	System.out.println(obj.multi());
       }
}
      
      