import java.util.*;

class Employee {

	int empId ;
	String empName;
	float empSalary;

	Employee(int empId , String empName,float empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String toString(){
		return (empId + " - " + empName + " - " + empSalary);
	}

	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);

		ArrayList<Employee> list = new ArrayList<>();

		for(int i = 1 ; i <= 5 ; i++)
			list.add(new Employee(sc.nextInt() , sc.next() , sc.nextFloat()));
		float sumOfSalaries = 0; 
		
		Iterator<Employee> itr = list.iterator();

		while(itr.hasNext()){
			Employee i = itr.next();
			sumOfSalaries= sumOfSalaries + i.empSalary;
			System.out.println(i);
		}

		System.out.println("Total Salries of Employees " + sumOfSalaries);
	}

}