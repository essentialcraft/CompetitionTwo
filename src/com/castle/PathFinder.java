package com.castle;

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

    public String pathfinder(Room[] input){

        for(Room r : input){
            int[] temp = r.getDoors();

            for(int i = 0; i < temp.length; i++){
                if(temp[i] == r.getRoomNumber() + 1){
                    pathBuilder.append(Constants.directions[i]);
                }
            }
        }

        return returnPath;
    }
}
