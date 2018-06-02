package com.datastructures.arrayBased.CircularQueue;

public class CircularQueue<E> implements Queue<E> {
	public static final int CAPACITY = 100;
	public int capacity;
	private E []CQ;
	private int size = 0;
	private int rare = 0;
	private int front = 0;
	public CircularQueue() {
		this(CAPACITY);
	}
	
	public CircularQueue(int capacity) {
		this.capacity = capacity;
		CQ = (E[]) new Object[this.capacity];
	}
	@Override
	public void enqueue(E e) throws QueueFullException {
		if(size == CQ.length) {
			throw new QueueFullException("Queue Full.");
		}else {
			CQ[front++%CQ.length] = e;
			size++;
		}
		
	}

	@Override
	public E deque() throws EmptyQueueException {
		E element;
		if(size == 0) {
			throw new EmptyQueueException("Queue is empty.");
		}else {
			element = CQ[rare%CQ.length];
			CQ[rare++%CQ.length] = null;
			size--;
		}
		return element;
	}
	
	public String toString() {
		String data = "";
		for(int i = 0;i<CQ.length;i++) {
			if(front%CQ.length == i) {
				data+=(CQ[i] != null)?"F:"+CQ[i]+"|":"<F?>"+"|";
			}else if(rare%CQ.length == i) {
				data+=(CQ[i] != null)?"R:"+CQ[i]+"|":"<R?>"+"|";
			}else {
				data+=CQ[i]+"|";
			}
		}
		return data;
	}
		
	public static void main(String[] args) {
		CircularQueue<String> cq = new CircularQueue<>(10);
		cq.enqueue("One");
		System.out.println(cq);
		cq.enqueue("Two");
		cq.enqueue("Three");
		cq.enqueue("Four");
		System.out.println(cq);
		cq.deque();
		System.out.println(cq);
		try {
		cq.enqueue("Five");
		cq.enqueue("Six");
		cq.enqueue("Seven");
		cq.enqueue("Eight");
		cq.enqueue("Nine");
		cq.enqueue("Ten");
		cq.enqueue("Eleven");
		cq.enqueue("Twelve");
		cq.enqueue("Thirteen");
		System.out.println(cq);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(cq);
		cq.deque();
		System.out.println(cq);
	}
}
