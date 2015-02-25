package com;

import com.utilities.*;
import com.castle.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {



	public static void main(String[] args){


		TestFileReader fileReader = new TestFileReader();

		Scanner scan = fileReader.getScanner();

		InputMethods input = new InputMethods();
		Sorter sorter = new Sorter();
		PathFinder path = new PathFinder();
		ArrayConverter converter = new ArrayConverter();
		ArrayList<Room> castle = new ArrayList<Room>();
		int numRooms = 0;
		boolean keepGoing = true;

		String star = "*";
		int spaces = 24;

		int totalRooms = 5;


		while(keepGoing){

			System.out.println("*------------------------*");
			System.out.print("|");
			
			for(int i = 0; i < spaces; i++){
				if(i < castle.size()){
					System.out.print(star);
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println("|");
			System.out.println("*------------------------*");

			System.out.println("\nEnter a room configuration:");

			String in = input.getNextLine();
			System.out.print("The last entered line was: " + in + "\n");
			//take data either from a file or from user input
			//in this case we can enter in test data much faster

			try{
				if(in.equals("999999")){
					break;
				} else if(in.equals("N")){
					while(scan.hasNext()){
						castle.add(new Room(converter.stringToInt(fileReader.getNextLine().split("\\s"))));
					}
					//castle.add(new Room(converter.stringToInt(fileReader.getNextLine().split("\\s"))));
				} else if(in.equals("T")){
					System.out.print("\nTest\n");
				} else {
					castle.add(new Room(converter.stringToInt(in.split("\\s"))));	
				}
			} catch (Exception e){
				System.out.println("File read failure from main");
			}
			

			


			

		}

		

		
		

	}
	
}