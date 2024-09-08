
public class LInkedListDemo 
{
	static class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static class LinkedList
	{
		private Node ahead;
		private int size;
		public LinkedList()
		{
			this.ahead=null;
			this.size=0;
		}
		public void addHead(int data)
		{
			Node mewNode=new Node(data);
			if(this.head!=null)
	
}
		
	}
	public void reverseIterate()
	{
		Node prevNode=head;
		Node currNode=head.next;
		if (head=null||head.next==null)
		{
			return;
		}
		while(currNode!=null)
		{
			Node nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		head.next=null;
		head=prevNode;
	}

	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList
	}

}
