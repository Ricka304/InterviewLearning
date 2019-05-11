package DataStructureImplementations;

public class LinkedList {

	Node head;

	public void insert(int data) {
		Node node = new Node();
		// creating the node - with data and next = null
		node.data = data;
		node.next = null;
		// Check the head if new node then directly assign to head
		if (head == null) {
			head = node;
		}
		// if an existing node then traverse till the end and attach there
		else {
			Node node2 = head;
			while (node2.next != null) {
				node2 = node2.next;
			}
			node2.next = node;
		}
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + "-->");
			node = node.next;
		}
		System.out.print(node.data + "-->null");
	}

	public void reverse()
	{
		Node node=head;
		
	}
}
