package com.company.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.

    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

   public Building(int length, int width, int lotLength, int lotWidth)
   {
       mLength =length ;
       mWidth = width;
       mLotLength = lotLength;
       mLotWidth = lotWidth ;
   }

    public int getLength() {
        return mLength;
    }

    public int getWidth() {
        return mWidth;
    }

    public int getLotLength() {
        return mLotLength;
    }

    public int getLotWidth() {
        return mLotWidth;
    }

    public void setLength(int length) {
        this.mLength = length;
    }

    public void setWidth(int width) {
        this.mWidth = width;
    }

    public void setLotLength(int lotLength) {
        this.mLotLength = lotLength;
    }

    public void setLotWidth(int lotWidth) {
        this.mLotWidth = lotWidth;
    }
    public int calcBuildingArea(){
    return getLength()*getWidth();
    }
    public int calcLotArea(){
    return mLotLength*mLotWidth;
    }
    public String toString(){
      return "length = " + getLength()+ "width = " + getWidth() + "lotLength = " + getLotLength() + "lotWidth = " + getLotWidth();
    }

}
