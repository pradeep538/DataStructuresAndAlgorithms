package com.datastructures.arrayBased.stack;

public interface Stack<E> {
	
	public int size();
	public boolean isEmpty();
	public void push(E e);
	public E top() throws EmptyStackException;
	public E Pop() throws EmptyStackException;

}
