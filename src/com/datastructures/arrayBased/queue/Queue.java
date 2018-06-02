package com.datastructures.arrayBased.queue;

public interface Queue<E> {
	public void enque(E e) throws QueueFullException;
	public E deque() throws EmptyQueueException;
}
