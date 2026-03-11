/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklands.interfaces;

/**
 *
 * @author Aaron
 */
public interface QueueInterface {
    
    //add an object to the end of the queue
    public void enqueue(Object newItem);
    
    //remove the object at the front of the queue
    public Object dequeue();
    
    //view the object at the front without removing it
    public Object peek();
    
    //check if the queue is empty
    public boolean isEmpty();
    
    //return the size of the queue
    public int size();
    
    //display queue contents
    public String displayQueue();
    
}
