/*create a java application where we have one package, it contains one concrete class with one parameterized constructor and one method
with parameter and RT, one abstract class it contains one
parameterized constructor, one abstract method, and one defined
method with parameter and return type, one interface, it contains one
defined and one abstract method with parameter and return types,
with respect to this package we have one subpackage it contains two
interfaces, with respect to individual abstract and defined methods
with P and RT, with respect to this package we have another sub-sub
package it contains one concrete class with Parameterused
constructor and one defined method with P and RT, two interfaces
with respect to individual abstract and defined methods with P and
RT, then access all these features into a separate class of separate
packages like main package and sub package features by using
import keyword, and sub-sub package features by using fully qualified
name approach (Packages folder)*/
package p1;
import java.util.Scanner;
public class A
{
	public static Scanner sc=new Scanner(System.in);
	public A(int a)
	{
		System.out.print(a);
	}
	public String m1(int a)
	{
		System.out.print(a);
		return sc.next();

	}
}