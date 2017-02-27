
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
	
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
		//TODO:  Queue needs to be initialized to an empty Queue.
	}
	
	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty () {
		//TODO:  Needs to return true when empty and false otherwise
		return true; //DELETE AND CHANGE TO SOMETHING SENISBLE
	}
	
	/**
	 * 
	 */
	
	/**
	 * Returns the element at the head of the queue
	 */
	public Object peek () throws NoSuchElementException {
		//TODO:  Returns the front of the queue if it exists and throws an exception otherwise
		return null; //DELETE AND CHANGE TO SOMETHING SENSIBLE
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public void dequeue () throws NoSuchElementException {
		//TODO:  Removes the front front of the queue if it exists and throws an exception otherwise
	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue (Object element) {
		//TODO:  Puts an element on the back of the queue.
	}
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print () {
		//TODO:  Prints out the full queue.  If empty prints out a line saying so.
	}
}