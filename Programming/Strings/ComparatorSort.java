/*Write a program to print all the words in the sentence in increasing order of word size.
NOTE :   Words of the same size should be in lexical(Alphabetical) order.

Input 1 :           A journey of thousand miles begin with single step      

Output 1 :

    A
    of
    step
    with
    begin
    miles
    journey
    thousand
------------------------------------------------------------------------------/*

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        Arrays.sort(s1);
	Arrays.sort(s1,Comparator.comparing(String::length));
        for(String k:s1)
        {
            System.out.println(k);
        }
    }
}
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Write your code here. 
        String s=sc.nextLine();
        String s1[]=s.split(" ");
     
        for(int i=1;i<s1.length;i++)
        {
            for(int j=0;j<s1.length-i;j++)
            {
                if(s1[j].compareTo(s1[j+1])>0)
                {
                   String t=s1[j];
                    s1[j]=s1[j+1];
                    s1[j+1]=t;
                }
            }
        }
        for(int i=1;i<s1.length;i++)
        {
            for(int j=0;j<s1.length-i;j++)
            {
                if(s1[j].length()>s1[j+1].length())
                {
                    String t=s1[j];
                    s1[j]=s1[j+1];
                    s1[j+1]=t;
                }
            }
        }
        for(String k:s1)
        {
            System.out.println(k);
        }
    }
}