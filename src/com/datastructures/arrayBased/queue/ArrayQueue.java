package com.datastructures.arrayBased.queue;

public class ArrayQueue<E> implements Queue<E>{
	public static final int CAPACITY = 1000;
	protected int capacity;
	protected E Q[];
	protected int rear = -1; 
	protected int front = -1;
	
	public ArrayQueue(){
		this(CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity){
		this.capacity = capacity;
		Q = (E[]) new Object[this.capacity];
	}
	@Override
	public void enque(E e) throws QueueFullException {
		if(rear == capacity-1){
			throw new QueueFullException("Queue is full");
		}else{
			Q[++rear] = e;
		}
		
	}
	@Override
	public E deque() throws EmptyQueueException {
		E element;
			if(rear == front){
				throw new EmptyQueueException("Queue is empty");
			}else{
				element = Q[++front];
				Q[front] = null;
			}
		return element;
	}
	
	public String toString(){
		String data = "";
		if(Q.length > 0)
			for(int i = 0;i < Q.length ; i++){
				if(Q[i] != null)
				data+="Element "+i+":"+Q[i]+"\n";
			}
		return data;
	}
	
	public static void main(String[] args) {
		ArrayQueue<String> queue = new ArrayQueue<String>(100);
		queue.enque("one");
		System.out.println(queue.deque());
		System.out.println("de-queueing empty queue");
		try{
		System.out.println(queue.deque());
		}catch(Exception e){
			System.out.println(e);
		}
		queue.enque("Two");
		queue.enque("Three");
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		queue.enque("Four");
		queue.enque("Five");
		System.out.println(queue);
	}
}
