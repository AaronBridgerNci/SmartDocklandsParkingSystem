/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklands.interfaces;

/**
 *
 * @author Aaron
 */
public interface StackInterface {
    
    //add an object to the top of the stack
    public void push(Object newItem);
    
    //remove the top object from the stack
    public Object pop();
    
    //look at the top object without removing it
    public Object peek();
    
    //check if the stack is empty
    public boolean isEmpty();
    
    //return the size of the stack
    public int size();
    
    //display the stack contents
    public String displayStack();
    
}