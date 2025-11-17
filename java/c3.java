import java.util.Scanner;
class Employee
{
	static Scanner sc=new Scanner(System.in);
	Employee(long empId, String name, long salary, long mobileno)
	{
		System.out.println(empId+" "+name+" "+salary+" "+mobileno);
	}
	public static void main(String[]args)
	{
	new Employee(sc.nextLong(),sc.next(),sc.nextLong(),sc.nextLong());
	}
}
    