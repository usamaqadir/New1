


public class List extends Linked_List 
{
	
	public Node first = null;
	public Node last = null;
	public Node list;
	public int i,size;
	
			 
	public void add(int num)
	{
		Node list = new Node(num);
		
		if (first==null)
		{
			first=list;
			last=first;
		}
		else
		{
			last.next=list;
			list.previous=last;
			last=list;
		}
	}
	public void remove()
	{
		
		last=last.previous;
		last.next=null;
	}
	public void sort()
	{
		Node x = first;
		
		for(int j=0;j<5;j++)
		{
			Node f = x;
			Node g=x.next;
			if(f.num>g.num)
			{
			int m=f.num;
			f.num=g.num;
			g.num=m;
			}
		x=x.next;
		}
		
	}

	public void search( int snum)
	{
		boolean found = false;
		Node x = first;
		
		while (x.next != null)
		{
			if(x.num == snum)
			{	
				System.out.println("Value Exists . Index:"+x.next);
				found = true;
				break;
			}
			x=x.next;
		}
		if(!found)
		{
			System.out.println("Does not exist");
		}
		
	}
	
	
	
	
	
	
}
