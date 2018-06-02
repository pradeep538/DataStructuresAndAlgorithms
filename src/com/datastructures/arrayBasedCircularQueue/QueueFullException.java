package com.datastructures.arrayBasedCircularQueue;

public class QueueFullException extends RuntimeException {
	QueueFullException(String err){
		super(err);
	}
}
