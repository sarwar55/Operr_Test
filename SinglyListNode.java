package org.sarwar.operr;

public class SinglyListNode {

	private Node head;
	private int size;

	private class Node {
		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public SinglyListNode(int data) {
		this.head = new Node(data);
		this.size = 1;
	}

	public void append(int data) {
		Node tempNode = head;

		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}

		tempNode.next = new Node(data);
		size++;
	}

	public Node removefromTail() {
		if (head == null || head.next == null) return null;
		Node n = head;
		while(n.next.next != null) {
	        n = n.next;
	    }
	    n.next = null;
	    return head;
	}

	public Node removeGreaterThanElement(int d) {
		while (head != null && head.data > d) head = head.next;
		Node curr = head;
        while (curr != null && curr.next != null)
            if (curr.next.data > d) curr.next = curr.next.next;
            else curr = curr.next;
        return head;
	}

	public void print() {
		Node tmp = head;
		System.out.print("Current List: ");
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}

		System.out.println();
	}
	
	public static void main(String[] args) {
		SinglyListNode head = new  SinglyListNode(7) ;
		head.append(2);
		head.append(4);
		head.append(9);
		head.append(9);
		head.removefromTail();
		head.removeGreaterThanElement(6);
		head.print();

	}
}
