package com.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Ian on 2/11/2015.
 */
public class TestFileReader {

    private File file;
    private String filename = "STD_IN.txt";



    private Pattern pattern;
    private String patternString;

    private Scanner scan;
    private BufferedReader reader;

    public TestFileReader(){

        try {
            file = new File(filename);
            scan = new Scanner(file);
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public Scanner getScanner(){
        return scan;
    }

    public String getNextLine() throws Exception {
        if(scan.hasNext()){
            
            System.out.println(scan.nextLine());
        }

        return reader.readLine();
    }

    public void lineByLine(){
        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }

       
    }

  


}
