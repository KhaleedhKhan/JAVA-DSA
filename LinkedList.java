// Online Java Compiler
// Use this online editor to compile and run Java code online
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class ListNode{
	int data;
	ListNode next;
	ListNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}

class WorkAtTech
{
	static ListNode head;
	
	public static void insertAtEnd(int data)
	{   
		if(head==null)
		{
			ListNode newNode = new ListNode(data);
			head = newNode;
			return; 
		}
		
		ListNode temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		ListNode newNode = new ListNode(data);
		temp.next = newNode;
	}
	
	public static void insertAtBeg(int data){
		if(head==null)
		{
			ListNode newNode = new ListNode(data);
			head=newNode;
			return;
		}
		
		ListNode newNode= new ListNode(data);
		newNode.next=head;
		head=newNode;
	}
	public static void insertAtMid(int data)
	{
		if(head==null)
		{
			ListNode newNode= new ListNode(data);
			head=newNode;
			return;
		}
		
	     ListNode fast = head;
		ListNode slow = head;
		
		while(fast!=null && fast.next!=null)
		{
			fast = fast.next.next;
			if(fast!=null)
			{
				slow=slow.next;
			}
		}
		ListNode newNode=new ListNode(data);
		newNode.next=slow.next;
		slow.next = newNode;
	}
	
	public static void DelAtBeg()
	{
		if(head==null)
		{
			System.out.print("Empty");
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		head=head.next;
	}
	
	public static void DelAtMid()
	{
		if(head==null)
		{
			System.out.print("Empty");
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
         }
   
      if (prev == null) {
        
        head = slow.next;
        }
		else {
       
        prev.next = slow.next;
      }
	 }
	
	public static void DelAtEnd()
	{
		if(head==null)
		{
			System.out.print("Empty");
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		
		ListNode temp = head;
		ListNode temp1 = temp;
		while(temp.next!=null)
		{
			temp1 = temp;
			temp = temp.next;
		}
		temp1.next=null;
	}
	
	public static void DelElement(int value)
	{
		if(head==null)
		{
			System.out.print("Empty");
			return;
		}
		ListNode temp = head;
		ListNode prev = null;
		
		while(temp!=null && temp.data!=value)
		{
			prev=temp;
			temp =temp.next;
		}
		if(temp==null)
		{
		   System.out.print("Element Not Found");
			return;
		}
		if(prev==null)
		{
			head=temp.next;
		}
		else{
			prev.next=temp.next;
		}
	}
	
	public static void display(){
		if(head==null)
		{
			System.out.print("Empty");
		}
		ListNode temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void reverseprint(ListNode node)
	{
		if(node==null)
		{
			return;
		}
		reverseprint(node.next);
		System.out.print(node.data+" ");
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{ 
		insertAtBeg(2);
		insertAtEnd(4);
		insertAtEnd(3);
		insertAtBeg(5);
		insertAtEnd(7);
		insertAtMid(8);
		display();
		// DelAtEnd();
		// DelAtBeg();
		// DelAtMid();
		// display();
		// DelElement(7);
		// display();
		// reverseprint(head);
	
		
	}
}
