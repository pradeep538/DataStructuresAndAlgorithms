package com.datastructures.arrayBased.CircularQueue;

public class QueueFullException extends RuntimeException {
	QueueFullException(String err){
		super(err);
	}
}
