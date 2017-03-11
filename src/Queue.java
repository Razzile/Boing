
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by LinkedListElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author you
 *
 */

import java.util.NoSuchElementException;

public class Queue {

	//TODO:  You need some data to store the queue.  Put the attributes here.
	QueueElement first;
	QueueElement last;
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
		this.first = null;
		this.last = null;
	}
	
	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty () {
		return (first == null);
	}
	
	/**
	 * 
	 */
	
	/**
	 * Returns the element at the head of the queue
	 */
	public Object peek () throws NoSuchElementException {
		if (!isEmpty()) {
			return first.getElement();
		} else {
			throw new NoSuchElementException("No element at head of queue");
		}
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public void dequeue () throws NoSuchElementException {
		if (!isEmpty()) {
			first = first.getNext();
		} else {
			throw new NoSuchElementException("No element at head of queue");
		}
	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue (Object element) {
		QueueElement next = new QueueElement(element, null);
		if (isEmpty()) {
			first = next;
		} else {
			last.setNext(next);
		}
		last = next;
		last.setNext(null);
	}
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print () {
		QueueElement elem = first;
		if (elem == null) {
			System.out.println("Queue is empty");
		} else {
			while (elem != null) {
				System.out.println(elem.getElement().toString());
				elem = elem.getNext();
			}
		}
	}
}