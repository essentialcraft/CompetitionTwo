package com.utilities;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;
import java.util.ArrayList;
import com.castle.*;

/**
 * Created by Ian on 2/16/2015.
 */
public class InputMethods {

    private Scanner scan;

    private String buffer;

    //for formatting castle ui
	String star = "*";
	int spaces = 24;


    public InputMethods(){
        scan = new Scanner(System.in);
    }

    public String getNextLine(){
        return scan.nextLine();
    }

    public void printOptions(String[] input){
    	for(String in : input){
    		System.out.println(in);
    	}
    }

    public void makeWindow(ArrayList<Room> input){

    	System.out.println("+------------------------+");
    	System.out.print("|");
    	for(Room r : input){
    		System.out.print(star);
    	}

    	for(int i = 0; i < (spaces - input.size()); i++){
    		System.out.print(" ");
    	}
    	System.out.print("|\n");
    	System.out.println("+------------------------+");
    }



    
}
