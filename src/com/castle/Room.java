package com.castle;

import java.util.HashMap;

/**
 * Created by Ian on 2/6/2015.
 */
public class Room {

    private int[] doors;

    private int roomNumber;
    static int totalRooms = 1;

    public Room(int[] input){

        roomNumber = totalRooms++;
        doors = input;
    }

    public void printDoors(){
        System.out.println("+-+");
        System.out.print("|"+ roomNumber + "|");
        
        for(int i : doors){
            System.out.print(i + " ");
        }

        System.out.print("|\n");
    }

    public int[] getDoors(){
        return doors;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    

}
