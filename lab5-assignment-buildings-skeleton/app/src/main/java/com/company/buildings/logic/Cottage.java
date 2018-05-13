package com.company.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {
       
    // TODO - Put your code here.
    private boolean mSecondFloor;

    public Cottage(int dimension, int lotLength, int lotWidth){
        super(dimension, dimension,lotLength,lotWidth);

    }
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor){
        super(dimension,dimension,lotLength,lotWidth,owner,secondFloor);
        mSecondFloor = secondFloor;
    }
    public boolean hasSecondFloor(){
        if(mSecondFloor == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString(){
        if(mSecondFloor) {
            return super.toString() + "; is a two store cottage";
        }
        else
        {
            return super.toString() + "; is a cottage";
        }
    }
}

