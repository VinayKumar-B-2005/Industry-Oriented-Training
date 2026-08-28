package day_8;

class p5 {
	static class Node{
		int data;
		Node previous;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

	public static void main(String[] args) {
		
		Node first=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		first.next=second;
		second.next=third;
		second.previous=first;
		third.previous=second;

		Node fourth=new Node(40);
		Node fifth=new Node(50);
		Node sixth=new Node(60);
		fourth.next=fifth;
		fifth.next=sixth;
		fifth.previous=fourth;
		sixth.previous=fifth;

		third.next=fourth;
		fourth.previous=third;

		Node head=first; 
		Node tail=sixth; 

		Node current=head;
		System.out.println("Forward (Merged): ");
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current=current.next;
		}

		current=tail;
		System.out.println("\nBackward (Merged): ");
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current=current.previous;
		}
		System.out.println();
	}
}