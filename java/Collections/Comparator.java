/*Comparator:
->It is a predefined interface present in util package and it contains an abstract method like public abstract int compare(Object O1,Object O2);
->It is necessary to import Comparator interface from java.util package
->When we implement comparator interface we must override compare method and should provide functionality to that method
->When we deal with user defined classes, we need to mention generic of Comparator as user defined classname
->After creating object of classes which are implementing Comparator interface we need to give objects of list and Comparator as paramenters to Collections.sort(Obj,Obj) method and based on the method functionality the elements will be sorted accordingly.
----------------------------------------------------------------------------------------------------
Differences btw Comparable & Comparator:
             Comparable
Comparable provides a single sorting sequence
Under Comparable, it affects the Original Class and Structure
Comparable provides compareTo(obj) method to sort the elements
It is present in java.lang Package
We can Sort the list elements of Comparable type by Collection.sort(list) method


Comparator provides multiple sorting sequences
Under Comparator, it doesnt affect the Original Class
Comparator Provides compare(obj,obj) menthod to sort the elements
It is present in java.util Package
We can sort the list elements of Comparator type by Cllections.sort(list, Comparator Method)
*/
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
class Student
{
	private int id;
	private String name;
	private double marks;
	Student(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;	
	}
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	double getMarks()
	{
		return marks;
	}
	public String toString()
	{
		return id+",  "+",  "+name+",  "+marks;
	}
}
class Idsort implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s1.getId()-s2.getId();
	}
}
class Namesort implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}
class Markssort implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.getMarks() > s2.getMarks())
		{
			return 1;
		}
		else if(s1.getMarks() < s2.getMarks())
		{
			return -1;
		}
		else
		{
		 	return 0;
		}
	}
}
class Test
{
	public static void main(String[]args)
	{
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(7,"hiii",380));
		al.add(new Student(2,"hoo",680));
		al.add(new Student(9,"Amit",180));
		al.add(new Student(1,"byee",20));
		System.out.print(al);
		Collections.sort(al, new Markssort());
		System.out.print(al);
		
	}
}
