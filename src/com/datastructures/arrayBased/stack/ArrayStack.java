package com.datastructures.arrayBased.stack;
public class ArrayStack<E> implements Stack<E>{
	
	protected int capacity;
	
	public static final int CAPACITY = 1000;

	protected E []S;
	
	protected int top = -1;
	
	public ArrayStack() {
		this(CAPACITY);
	}
	
	public ArrayStack(int cap){
		capacity = cap;
		S = (E[]) new Object[cap];
	}
	
	@Override
	public int size() {
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		return (top < 0);
	}

	@Override
	public void push(E element) {
		if(size() == capacity) throw new FullStackException("Stack Full");
		
		S[++top] = element;
	}

	@Override
	public E top() throws EmptyStackException {
		if(size() > 0){
			return S[top];
		}else{
			throw new EmptyStackException("Stac is Empty.");
		}
	}

	@Override
	public E Pop() throws EmptyStackException {
		E element = null;
		if(size() > 0){
			element = S[top];
			S[top--] = null;
		}else{
			throw new EmptyStackException("Stack is Empty");
		}
		return element;
	}
	
	public String toString(){
		String Data = "";
		for(int i = 0; i < S.length;i++){
			if(S[i] != null)
			Data = Data+"Element "+(i+1)+":"+S[i]+"\n";
		}
		return Data;
	}

	public static void main(String[] args) {
		ArrayStack<String>  stack = new ArrayStack<String>();
		stack.push("Apple");
		String element1 = stack.Pop();
		System.out.println("Element 1:"+element1);
		System.out.println("Poping on empty stack");
		try{
			stack.Pop();	
		}catch (Exception e) {
			System.out.println(e);
		}
		stack.push("Ball");
		stack.push("Cat");
		System.out.println(stack);
		
	}
}
