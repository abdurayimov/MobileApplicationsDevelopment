package com.company.buildings.logic;

import android.os.Build;

import java.io.FileNotFoundException;

import com.company.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    // TODO - Put your code here.
    public  static void print(Building[] buildings, String header, OutputInterface out){
       for(Building b:buildings)
       {
           out.print(b.toString());
       }
    }
    public static int  calcArea(Building[] buildings){
        int flag_1 = 0;
        for(Building b:buildings)
        {
            flag_1 += b.calcLotArea();
        }
        return flag_1;
    }
    
}
