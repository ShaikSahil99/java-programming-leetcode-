import java.util.Scanner;
class A
{
     static Scanner sc=new Scanner(System.in);
          void m1(String a)
          {
              System.out.println("sahil is men");
          }
          void m2(boolean a)
          {
              m1(sc.next());
              System.out.println("Abu Gay");
          }
          
          
   
    public static void main(String[] ar)
    {
        A s=new A();
        s.m2(sc.nextBoolean());
            
    }
}    