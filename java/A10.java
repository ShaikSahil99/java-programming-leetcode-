import java.util.Scanner;
class Me
{
   static Scanner sc=new Scanner(System.in);
	
	static void m1()
	{
	for(int i=1;i<=5;i++){
	System.out.println(i);
	}
	}
	static void m2()
	{
	for(int j=5;j>=1;j--){
	System.out.println(j);
	}
	}
	
public static void main(String[]args)
{
	int s=sc.nextInt();
	if(s==1){
	m1();
	}
	else if(s==2){
	m2();
	}
}
	
	


}