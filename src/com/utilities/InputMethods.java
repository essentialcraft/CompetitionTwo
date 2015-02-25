package com.utilities;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

/**
 * Created by Ian on 2/16/2015.
 */
public class InputMethods {

    private Scanner scan;

    private String buffer;



    public InputMethods(){
        scan = new Scanner(System.in);
    }

    public String getNextLine(){
        return scan.nextLine();
    }
}
