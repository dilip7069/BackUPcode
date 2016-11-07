package SingleLinkedList;
import java.util.Scanner;
public class SLL {
	
	public static void main(String[] args)
	{
		int choice=0,value,out;
		boolean flag;
		SLLImplementation S= new SLLImplementation();
		Scanner sc=new Scanner(System.in);
		do			
		{
		System.out.println("1.Insert into Linked List\n2.IsEmpty??\n3.Traverse\n4.Delete\n5.Length of LL\n6.Delete First Node\n7.Get Nth Node");
		choice=Integer.parseInt(sc.nextLine());	
		switch(choice)	
		{
		case 1:System.out.println("Enter the value to be inserted");
		value=Integer.parseInt(sc.nextLine());
		S.insert(value);
		break;
		case 2:
		flag=S.isEmpty();
		if(flag)
			System.out.println("LL is Empty");
		else
			System.out.println("LL is not Empty");
		break;
		case 3:
		S.traverse();
		break;
		case 4:
		System.out.println("Enter value to be deleted");
		value=Integer.parseInt(sc.nextLine());
		flag=S.deleteNode(value);
		if(flag)
		System.out.println("Node deleted");
		else
		System.out.println("Node with "+value+" not found");
		break;
		case 5:
		value=S.length(S.getHead());
		System.out.println("Lenth of LL is "+value);
		break;
		case 6:
		flag=S.deleteFirst(S.getHead());
		if(flag)
		  System.out.println("Node deleted");
		else
			System.out.println("Empty LL");
		break;
		case 7:
		System.out.println("Enter the Node index");
		value=Integer.parseInt(sc.nextLine());
		S.getNthValue(value);
		break;
		default:
		System.out.println("Wrong option");
		}
		}while(choice<100);
	}

}

class SLLImplementation
{
	Node head=null;
	
	public Node getHead()
	{
		return this.head;
	}
	
	public void setHead(Node head)
	{
		this.head=head;
	}
	
	public void insert(int value)
	{
		Node n=new Node(head,value);
		head=n;	
	}
	
	public void traverse()
	{
		Node head=this.getHead();		//Get the current head
		if(isEmpty())					//Check if LL is empty
		{
			System.out.println("Empty Linked List");			
		}
		else							//Print LL
		{
			while(head!=null)			//Iterate until next pointer is null(End of LL).
			{
				System.out.print("->"+head.getVal());
				head=head.getNext();
			}
			System.out.println("");
		}
	}
	
	public boolean isEmpty()	//Returns true if head==null which means LL is Empty
	{
		return this.head==null;
	}
	
	public boolean deleteNode(int value)	//Delete a node with particular value
	{
		Node prev=null, curr=null;			//Take two pointers pointing to Current and previous Nodes
		if(isEmpty())						
			return false;
		else         						//If LL is not empty.
		{
			curr=this.getHead();			//Initialize current with head
			while(curr!=null)
			{
				if(curr.getVal()==value)	//If value equals current Node value
				{
					if(prev==null)			//If Previous node is null i.e., head node value matches
					{
						if(curr.getNext()!=null)	//If there is  next Node
						{
						curr.setVal(curr.getNext().getVal());
						curr.setNext(curr.getNext().getNext());
						return true;
						}
						else						//If there is no next Node
						{
							setHead(null);			//Set Head = null i.e., Deleting the only one existing node
							return true;	
						}
									
					}
					else							//If Previous not equals null
					{
						prev.setNext(curr.getNext());	//Update Previous Nodes next pointer to current node Next pointer
						return true;
					}
				}
				else
				{
					prev=curr;							//Update Current, Previous Nodes pointers
					curr=curr.getNext();
				}
			}
		}
		return false;
	}
	public int length(Node head)
	{
		Node temp=head;
		int count=0;
		while(temp!=null) //while temp!=null loop and increment count
		{
			count++;
			temp=temp.getNext();
		}
		return count;
	}
	public boolean deleteFirst(Node head)	//Delete First Node of the Linked List
	{
		Node temp=head;
		if(temp==null)						//Empty LL
			return false;
		else
		{
			if(temp.getNext()==null)		//LL with only one Node
			{
				setHead(null);
				return true;
				
			}
			else
			{
				setHead(temp.getNext());	//Update Head
				return true;
			}
		}
	}
	
	public void getNthValue(int value)
	{
		Node temp=getHead();
		if(value<1)
		{
			System.out.println("Wrong Index Entered");
			return;
		}
		else if(temp!=null)
		{
			for(int i=1;i<value;i++)
			{
				if(temp==null)
				{
					System.out.println("Index Exceeds the length");
					break;
				}
				temp=temp.getNext();				
			}
			System.out.println("Value at "+temp.getVal());
		}
		else
		System.out.println("Empty LL");	
	}
}



class Node   //This class represents a Node in Single Linked List
{
	private Node next;	//This is a pointer used to point to the next Node 
	private int val;	//Variable used to store Integer value.
	Node()		//Default Constructor
	{
		this.next=null;
	}
	Node(Node pointer, int value)   //Constructor with initial value
	{
		this.next=pointer;
		this.val=value;
	}
	public int getVal()		//Returns current node value
	{
		return this.val;
	}
	public void setVal(int value)	//Sets current node value
	{
		this.val=value;
	}
	public Node getNext()	// Returns current Nodes next value. Which is a pointer to the next node.
	{
		return this.next;
	}
	public void setNext(Node pointer) 	//Sets Current Nodes next value i.e., pointer to the next node.
	{
		this.next=pointer;
	}
}
