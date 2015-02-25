package com.utilities;

/**
 * Created by Ian on 2/1/2015.
 */
public class ArrayConverter {


    public int[] stringToInt(String[] input){

        int[] returnArray = new int[input.length];
        int index = 0;

        for(String item : input){
            returnArray[index] = Integer.parseInt(item);
            index++;
        }

        return returnArray;
    }


}
