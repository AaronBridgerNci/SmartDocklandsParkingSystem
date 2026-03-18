package smartdocklands.adt;

import smartdocklands.models.ParkingSpot;

/**
 *
 * @author Aaron
 */
public class MyLinkedList {

    Node head;

    public MyLinkedList() {

        head = null;

    }

    //add a parking spot to the list
    public void addSpot(ParkingSpot spot) {

        Node newNode = new Node(spot);

        if (head == null) {

            head = newNode;

        } else {

            Node current = head;

            while (current.next != null) {

                current = current.next;

            }

            current.next = newNode;

        }

    }

    //display parking spots
    public String displayList() {

        String str = new String();

        Node current = head;

        while (current != null) {

            str = str.concat(current.data.displaySpot());
            str = str.concat(" -> ");

            current = current.next;

        }

        return str;

    }

    //find first available (empty) parking spot
    public ParkingSpot getFirstAvailable() {

        Node current = head;

        while (current != null) {

            if (current.data.getStatus().equals("Empty")) {
                return current.data;
            }

            current = current.next;
        }

        return null;

    }

}