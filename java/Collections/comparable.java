import java.util.*;
class EmployeeAL implements Comparable<EmployeeAL>
{	
	String EmpName;
	double Salary;
	public String getName()
	{
		return EmpName;
	}
	public double getSalary()
	{
		return Salary;
	}
	EmployeeAL(String EmpName, double Salary)
	{
		this.EmpName=EmpName;
		this.Salary=Salary;
	}
	public int compareTo(EmployeeAL x)
	{
		if(this.Salary==x.Salary)
		{
			return 0;
		}
		if(this.Salary > x.Salary)			
		{
			return 1;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		ArrayList<EmployeeAL> al=new ArrayList<>();
		al.add(new EmployeeAL("Sahil",20000));
		al.add(new EmployeeAL("Yasin",50000));
		al.add(new EmployeeAL("Khalid",30000));
		al.add(new EmployeeAL("Mabbulu",10000));
		for(EmployeeAL y:al)
		{
			System.out.println(y.getName()+"  "+y.getSalary());
		}
		Collections.sort(al);
		for(EmployeeAL y:al)
		{
			System.out.println(y.getName()+"  "+y.getSalary());
		}
		
	}

}