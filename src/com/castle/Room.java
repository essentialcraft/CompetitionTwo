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

    public int[] getDoors(){
        return doors;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

}
