package org.triplebyte.com;

public class SingleLinkedList {

	Node head=null, tail=null;
	public void addItem(int val) 
	{
		if(head==null)
		{
			Node n=new Node(val);
			head=n;
			tail=n;
			return;
		}
		else
		{
		Node n=new Node(val);
		tail.setNext(n);
		return;
		}
		
	}
	public void remove(int val)
	{
		Node curr=head,prev=head;
		Node temp=null;
		if(lenghtOfSll()==0)
		{
			return;
		}
		else if(lenghtOfSll()==1)
		{
			if(curr.getVal()==val)
			{
			head=null;
			tail=null;
			}
            return;
		}
		else
		{
			while(curr.next!=null)
			{
				if(curr.getVal()==val)
				{
					if(curr.getNext()!=null)
					{
						curr.setVal(curr.getNext().getVal());
					    curr.setNext(curr.getNext().getNext()); 
					    temp=curr;
						curr=.getNext();
						prev=curr;
					    
					}
					else
					{
						tail=prev;
						prev.setNext(null);
						return;
					}
				}
				else
				{
					if(curr.getNext()!=null)
					{
					temp=curr;
					curr=curr.getNext();
					prev=curr;
					}
					else 
					return;
					
				}
					
				
			}
		}
	}
	public int lenghtOfSll()
	{
		Node temphead=head;
		int count = 0;
		if(temphead==null)
			return 0;
		while(temphead!=null)
		{
			count++;
			temphead=temphead.getNext();
		}
		return count;
	}

	
}
