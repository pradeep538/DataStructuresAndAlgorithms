package com.datastructures.queue;

public interface Queue<E> {
	public void enque(E e) throws QueueFullException;
	public E deque() throws EmptyQueueException;
}
