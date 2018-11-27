import java.util.*;

//Class which is used for making notes with help of objects
class Node
{
	Node next;
	int data;
	public Node()
	{
		next=null;
		data=0;
	}
	public void setData(int val)
	{
		data=val;
	}
	public int getData()
	{
		return data;
	}
	public void setNext(Node n )
	{
		next=n;
	}
	public Node getNext()
	{
		return next;
	}

}
//For all linked list query
class linkedlist
{
	Node start;
	Node end;
    int size;
    public linkedlist()
    {
    	start=null;
    	end=null;
    	size=0;
    }
    public boolean isempty()
    {
    	return start==null;
    }
    public int size()
    {
    	return size;
    }
    public void insertstart(int num)
    {
     Node ptr=new Node();
     ptr.setData(num);
     size++;
     if (start==null) {
     	start=ptr;
     	end=ptr;
     	ptr.setNext(null);
     	
     }
     else{
     	ptr.setNext(start);
     	start=ptr;
     }
    }
    public void insertend(int num)
    {
    	Node ptr=new Node();
    	ptr.setData(num);
    	size++;
    	if(start==null)
    	{
    		start=ptr;
    		end=ptr;
    		ptr.setNext(null);

    	}
    	else
    	{

    		end.setNext(ptr);
    		end=ptr;
    		ptr.setNext(null);
    	}
    }
    public void deleteAtstart()
    {
    	if (start==end) {
    		start=null;
    		end=null;
    		size--;
    	}
    	if (start==null) {
    	System.out.println("List is already empty");
    		
    	}
    	else
    	{
    		size--;
    	Node ptr=start;
    	ptr=ptr.getNext();
        start=ptr;
    }
    }
    public void deleteAtend()
    {
    	if(start==end)
    	{
    		size--;
    		start=null;
    		end=null;
    	}
    	if (start==null) {
    	System.out.println("List is already empty");
    		
    	}
    	else
    	{
    		size--;
          Node ptr=start;
          while(ptr.getNext().getNext()!=null)
          {
            ptr=ptr.getNext();
          }
          ptr.setNext(null);
          end=ptr;
    	}
    }
    public void displayall()
    {
    	Node ptr=start;
    	if (ptr==null) {
    		System.out.println("No element to display");
    		
    	}
    	else
    	{
    		System.out.print(ptr.getData());
    	while(ptr.getNext()!=null)
    	{
    		ptr=ptr.getNext();
    		System.out.print("-->"+ptr.getData());
    	}
    }
    }
    public void insertposition(int position,int val)
    {
     if(size<position ||position<0)
     {
     	System.out.println("Not possible to insert at that position");
     }
     else
     {
     	int counter=0;
     	Node ptr=new Node();
     	if(position==0)
     	{
     		
     ptr.setData(val);
      size++;
     if (start==null) {
     	start=ptr;
     	end=ptr;
     	ptr.setNext(null);
     	
     }
     else{
     	ptr.setNext(start);
     	start=ptr;
     }
     	}
     	else if(position==size)
     	{
     		ptr.setData(val);
    	size++;
    	

    		end.setNext(ptr);
    		end=ptr;
    		ptr.setNext(null);
     	}
     	else
     	{
     		ptr.setData(val);
     		Node temp=start;
       while(counter==position-2)
       {
temp=temp.getNext();
counter++;
       }
       ptr.setNext(temp.getNext());
       temp.setNext(ptr);
       size++;
     	}


    }

}
public void deleteposition(int position)
{
	 if(size<=position ||position<0)
     {
     	System.out.println("Not possible to delete at that position");
     }
     else
     {
     	if(position==0)
     	{

    	if (start==end) {
    		start=null;
    		end=null;
    		size--;
    	}
    	if (start==null) {
    	System.out.println("List is already empty");
    		
    	}
    	else
    	{
    		size--;
    	Node ptr=start;
    	ptr=ptr.getNext();
        start=ptr;
    }
     	}
     	else if (position==size-1) {
     		if(start==end)
    	{
    		size--;
    		start=null;
    		end=null;
    	}
    	if (start==null) {
    	System.out.println("List is already empty");
    		
    	}
    	else
    	{
    		size--;
          Node ptr=start;
          while(ptr.getNext().getNext()!=null)
          {
            ptr=ptr.getNext();
          }
          ptr.setNext(null);
          end=ptr;
    	}

     		
     	}
     	else
     	{
     	int counter=0;
     		Node temp=start;
       while(counter==position-2)
       {
temp=temp.getNext();
counter++;
       }
         temp.setNext(temp.getNext().getNext());
       size--;
     	}
     }
}


}

class singlylist
{
	public static void main(String arg[])
	{
	linkedlist ob=new linkedlist();
	ob.insertstart(1);
	ob.insertend(2);
	ob.insertstart(5);
	ob.displayall();
	System.out.println();
	ob.deleteposition(1);
	ob.displayall();
	System.out.println();
	}
}