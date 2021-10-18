package com.examples.ds.list;


class Node {

	private String data;
	private Node next;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(String data) {
		this.data = data;
	}
}
class LinkedList{
	
	private Node startNode;
	
	public boolean add(String data) {
		boolean added = true;
		Node node = new Node(data);
		if (startNode == null) {
			startNode = node;
		} else {
			// reach the last node from the start node
			Node currentNode = startNode;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(node);
		}
		return added;

	}
	
	public int size() {
		int size = 0;
		Node currentNode = startNode;
		while(currentNode!=null) {
			size++;
			currentNode = currentNode.getNext();
		}
		return size;
	}
	
	public boolean remove(String data) {
		boolean isDeleted = false;
		
		return isDeleted;
	}
}

public class LinkedListExample {

	public static void main(String[] args) {
		
		//adding to list
		LinkedList linkedList = new LinkedList();
		linkedList.add("roger");
		linkedList.add("rafa");
		linkedList.add("rohit");		
		//getting size of list
		System.out.println(linkedList.size());
		
		//remove from list
		System.out.println(linkedList.remove("roger"));
	}

}
