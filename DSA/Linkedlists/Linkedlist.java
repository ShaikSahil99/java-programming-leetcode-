//  addFirst, DeleteFirst, addLast, DeleteLast, size of LL, Print a LL, create LL loop, checkLoop, Loopcount of a LL.............


import java.util.*;
class LL
{
	static Scanner sc=new Scanner(System.in);
	Node head;
	int c=0;
	int d=0;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	void addFirst(int data)
	{	
		d++;
		Node nN=new Node(data);
		nN.next=head;
		head=nN;
	}
	void addLast(int data)
	{
		d++;
		Node temp=head;
		Node nN1=new Node(data);
		if(head==null)
		{
			head=nN1;
			return;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=nN1;
	}
	void deleteFirst()
	{
		d--;
		if(head==null)
		{
			System.out.print("Empty List");
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		head=head.next;
	}
	void deleteLast()
	{
		d--;
		if(head==null)
		{
			System.out.println("Empty LinkedList");
			return;
		}
		if(head.next==null)
		{	
			int k=head.data;
			head=null;
			return;
		}
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		return;
	}
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"---->");
			temp=temp.next;		
		}
		System.out.print("null");
	}
	int size()
	{
		Node temp1=head;
		if(head==null)
		{
			return 0;
		}
		while(temp1.next!=null)
		{
			c++;
			temp1=temp1.next;
		}
		return c+1;
		
	}
	void addFromLastIndex(int index,int data)
	{
		d++;
		Node slow=head,fast=head;
		Node nN2=new Node(data);
		int c=0;
	/*	while(fast.next!=null)
		{xd
			fast=fast.next;
			c++;
			if(c==index)
			{
				break;
			}
		}
	      */
		for(int i=1;i<=index;i++)
		{
			fast=fast.next;
		}	
	
		while(fast.next!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		nN2.next=slow.next;
		slow.next=nN2;
	}
	void addUsingIndex(int index,int data)
	{
		d++;
		Node temp=head;
		Node nN3=new Node(data);
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		nN3.next=temp.next;
		temp.next=nN3;	
	}
	boolean checkloop()
	{
		try
		{
			Node fast=head,slow=head;
			while(fast!=null && fast.next!=null)
			{
				fast=fast.next.next;
				slow=slow.next;
				if(fast==slow)
				{
					return true;
				}
			}
				return false;	
		}
		catch(NullPointerException e)
		{
			return false;
		}
	}
	void Createloop(int index)
	{
		Node temp=head;
		Node temp1=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		for(int i=0;i<index;i++)
		{
			temp1=temp1.next;
		}
		temp.next=temp1;
	}
	int Loopcount()
	{
		Node fast=head,slow=head;
		int lc=0;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
			{
				break;
			}
		}
		do
		{
			slow=slow.next;
			lc++;
		}
		while(fast!=slow);
		return lc;
	}
	public static void main(String[]args)
	{
		LL x=new LL();
		/*x.addFirst(sc.nextInt());
		x.addFirst(sc.nextInt());
		x.addFirst(sc.nextInt());
		x.addFirst(sc.nextInt());
		x.addFirst(sc.nextInt());
		x.addFirst(sc.nextInt());	
		x.print();
		System.out.println();
		System.out.println(x.checkloop());
		x.print();
		System.out.println();
		x.Createloop(sc.nextInt());
		System.out.println(x.checkloop());
		System.out.print(x.Loopcount());
		*/
		x.addFirst(10);
		x.addLast(50);
		x.addLast(70);
		x.addUsingIndex(1,30);
		x.addUsingIndex(3,60);
		x.addUsingIndex(2,40);
		System.out.println();
		x.display();
		x.deleteFirst();
		System.out.println();
		x.display();
		x.deleteL();
		System.out.println();
		x.display();
		x.deleteAtI(1);
		System.out.println();
		x.display();
		//System.out.println("\n"+x.s);
		System.out.println("\n"+x.mValue());
	}

}