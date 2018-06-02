package com.datastructures.arrayBased.queue;

public class QueueFullException extends RuntimeException {
	public QueueFullException(String err) {
		super(err);
	}
}
