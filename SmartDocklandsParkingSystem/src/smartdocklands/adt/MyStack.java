/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklands.adt;

import java.util.ArrayList;
import smartdocklands.interfaces.StackInterface;
import smartdocklands.models.Vehicle;

/**
 *
 * @author Aaron
 */
public class MyStack implements StackInterface {

    //data member for the Stack
    ArrayList<Vehicle> theStack;

    //setting up an empty Stack
    public MyStack() {
        theStack = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    /*
    * push method adds a vehicle to the top of the stack
    */
    @Override
    public void push(Object newItem) {
        theStack.add(0, (Vehicle)newItem);
    }

    /*
    * remove the top vehicle from the stack
    */
    @Override
    public Object pop() {
        if (!theStack.isEmpty()) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    /*
    * view the top vehicle without removing it
    */
    @Override
    public Object peek() {
        if (theStack.isEmpty()) {
            System.out.println("Empty stack");
            return null;
        } else {
            return theStack.get(0);
        }
    }

    /*
    * return the size of the stack
    */
    @Override
    public int size() {
        return theStack.size();
    }

    /*
    * display the stack contents
    */
    @Override
    public String displayStack() {

        String str = new String();

        if (theStack.isEmpty()) {
            str = str.concat("EMPTY!");
        } else {

            for (int i = 0; i < theStack.size(); i++) {
                str = str.concat(theStack.get(i).displayInfo());
                str = str.concat(" ; ");
            }

        }

        return str;
    }

}