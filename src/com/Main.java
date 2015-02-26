package com;

import com.utilities.*;
import com.castle.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {



	public static void main(String[] args){


		/*
		* Custom utility methods from package
		*/
		TestFileReader fileReader = new TestFileReader();
		InputMethods input = new InputMethods();
		Sorter sorter = new Sorter();
		ArrayConverter converter = new ArrayConverter();

		Scanner scan = fileReader.getScanner();


		/*
		* Specific to the castle solution
		*/
		String[] options = new String[]{"Main Menu", 
									"A: Print current rooms",
									"N: Load default map profile",
									"Map: Graph map",
									"Or, enter a new room configuration:"};
		PathFinder path = new PathFinder();
		ArrayList<Room> castle = new ArrayList<Room>();
		int numRooms = 0;
		
		//for formatting castle ui
		String star = "*";
		int spaces = 24;

		int totalRooms = 5;

		//while loop flag
		boolean keepGoing = true;

		while(keepGoing){

			//this.makeWindow();

			input.printOptions(options);
			System.out.println();

			String in = input.getNextLine();
			System.out.print("The last entered line was: " + in + "\n");
			//take data either from a file or from user input
			//in this case we can enter in test data much faster

			try{
				if(in.equals("999999")){
					break;
				} else if(in.equals("A")){
					path.findPath(castle);

				} else if(in.equals("N")){
					while(scan.hasNext()){
						castle.add(new Room(converter.stringToInt(fileReader.getNextLine().split("\\s"))));
					}
					//castle.add(new Room(converter.stringToInt(fileReader.getNextLine().split("\\s"))));
				} else if(in.equals("Map")){

					input.makeWindow(castle);

				} else {
					castle.add(new Room(converter.stringToInt(in.split("\\s"))));	
				}
			} catch (Exception e){
				System.out.println("File read failure from main");
			}
			
			//
				
		}

		

		

		
		

	}


	
}