/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartdocklands.manager;

import smartdocklands.adt.MyQueue;
import smartdocklands.adt.MyStack;
import smartdocklands.adt.MyLinkedList;
import smartdocklands.models.Vehicle;
import smartdocklands.models.ParkingSpot;

public class ParkingManager {

    private MyQueue waitingQueue;
    private MyStack recentStack;
    private MyLinkedList parkingSpots;

    public ParkingManager() {

        waitingQueue = new MyQueue();
        recentStack = new MyStack();
        parkingSpots = new MyLinkedList();

    }

    // add parking spot
    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.addSpot(spot);
    }

    // display parking spots
    public String displayParkingSpots() {
        return parkingSpots.displayList();
    }

    // display waiting queue
    public String displayWaitingVehicles() {
        return waitingQueue.displayQueue();
    }

    // display recent vehicles
    public String displayRecentVehicles() {
        return recentStack.displayStack();
    }

    // MAIN method for adding + parking + message
    public String parkVehicleWithMessage(Vehicle v) {

        ParkingSpot spot = parkingSpots.getFirstAvailable();

        if (spot != null) {

            spot.assignVehicle(v);
            recentStack.push(v);

            return v.displayInfo() + " has been added to Parking Spot " + spot.getSpotID();

        } else {

            waitingQueue.enqueue(v);
            return v.displayInfo() + " added to waiting queue";

        }

    }

}