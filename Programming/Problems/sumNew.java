import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n == 0){
            System.out.println("ZERO.");
        }else if(n < 0){
            System.out.println("Negative Input.");
        }else if(("" + n).length() < 4){
            System.out.println("Given input doesn't contain more than four digits.");
        }else{
            String a = "";
            int d = 10 , t = n;
            while(n > 0){
                a = n % d + ((d == 10) ? "":"+") + a;
                n = n - n % d; 
                d *= 10;
            }
            System.out.println(a + "=" + t);
        }
        
    }
}