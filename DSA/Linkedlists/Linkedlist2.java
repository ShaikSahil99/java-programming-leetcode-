import java.util.Scanner;
class LL
{
	static Scanner ip=new Scanner(System.in);
	static LL list=new LL();
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	void addLast(int data)
	{
		Node temp=head;
		Node nN=new Node(data);
		if(head==null)
		{
			head=nN;
			return;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=nN;
	}
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;		
		}
		System.out.println("null");
	}
	LL LLmergeSort(LL list1,LL list2)
	{	
		Node temp1=list1.head;
		Node temp2=list2.head;
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data <= temp2.data)
			{
				list.addLast(temp1.data);
				temp1=temp1.next;
			}
			else
			{
				list.addLast(temp2.data);
				temp2=temp2.next;
			}
		}
		while(temp1!=null)
		{
			list.addLast(temp1.data);
			temp1=temp1.next;
		}
		while(temp2!=null)
		{
			list.addLast(temp2.data);
			temp2=temp2.next;
		}
		return list;
	}
	void ReverseList()
	{
		Node PREV=head;
		Node CURR=head.next;
		while(CURR!=null)
		{
			Node NEXT=CURR.next;
			CURR.next=PREV;
			PREV=CURR;
			CURR=NEXT;
		}
		head.next=null;
		head=PREV;
	}
	public static void main(String[]args)
	{
		LL list1=new LL();
		int n=ip.nextInt();
		for(int i=1;i<=n;i++)
		{
			list1.addLast(ip.nextInt());
		}
		list1.print();
		System.out.println();
		LL list2=new LL();
		n=ip.nextInt();
		for(int i=1;i<=n;i++)
		{
			list2.addLast(ip.nextInt());
		}
		list2.print();
		System.out.println();
		list=list.LLmergeSort(list1,list2);
		list.print();
		System.out.println();	
		list.ReverseList();
		list.print();	
	}
}