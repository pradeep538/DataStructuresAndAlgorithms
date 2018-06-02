package com.datastructures.linkedList;

public class LinkedList<E> {
	private int size = 0;
	private Node head;
	private Node tail;
	public static class Node<E>{
		private E element;
		private Node next;
		public E getElement() {
			return element;
		}
		public void setElement(E element) {
			this.element = element;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	public void insertAtFirst(E element) {
		Node node = new Node<E>();
		node.setElement(element);
		if(head == null) {
			head = node;
			tail = node;
		}else {
			node.setNext(head);
			head = node;
		}
		size++;
	}

	public void insertAtLast(E element) {
		Node node = new Node<E>();
		node.setElement(element);
		if(tail == null && head == null) {
			tail = node;
			head = node;
		}else {
			tail.setNext(node);
			tail = node;
		}
		size++;
		
	}

	public int getSize() {
		return size;
	}
	
	public E first() {
		return (E) this.head;
	}

	public E last() {
		return (E) this.tail;
	}

	public E removeAtFirst() {
		E node = (E) head;
		head = head.getNext();
		size--;
		return node;
	}
	
	public String toString() {
		String data = "";
		data+=head.getElement()+"|";
			for(int i = 1; i< size;i++) {
				data+=head.getNext().getElement()+"|";
			}
		return data;
	}
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.insertAtFirst("One");
		list.insertAtFirst("Two");
		System.out.println(list);
		list.removeAtFirst();
		System.out.println(list);
		list.insertAtLast("Three");
		System.out.println(list);
	}
}
