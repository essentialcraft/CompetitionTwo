package com.castle;

import java.util.ArrayList;

/**
 * Created by Ian on 2/6/2015.
 */
public class PathFinder {

    private String returnPath;
    private StringBuilder pathBuilder;

    public PathFinder(){
        returnPath = "";
        pathBuilder = new StringBuilder(returnPath);
    }

    public void findPath(ArrayList<Room> input){

        for(Room r : input){
            r.printDoors();
        }

    }
}
