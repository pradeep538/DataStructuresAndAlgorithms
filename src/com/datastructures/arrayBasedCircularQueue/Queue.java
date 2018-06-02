package com.datastructures.arrayBasedCircularQueue;

public interface Queue<E> {
	public void enqueue(E e ) throws QueueFullException;
	public E deque() throws EmptyQueueException;
}
