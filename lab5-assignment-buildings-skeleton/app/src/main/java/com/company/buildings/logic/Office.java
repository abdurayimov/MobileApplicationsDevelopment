package com.company.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0 ;

    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
        mParkingSpaces = 0;
        mBusinessName = null;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        super(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        super(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }
    @Override
    public String toString(){
        if(mBusinessName == null)
        {
            if(getParkingSpaces() > 0)
            {
                return "unoccupied; has " + getParkingSpaces() + "parking spaces (total offices: " + sTotalOffices + ")";
            }
            else
            {
                return "Business: unoccupied" + " (total offices: " +  sTotalOffices + ")";
            }
        }
        else{
            if(getParkingSpaces() > 0) {
                return mBusinessName + "; has " + getParkingSpaces() + "parking spaces (total offices: " + sTotalOffices + ")";
            }
            else {
            return mBusinessName + "(total offices: " + sTotalOffices + ")";
            }
        }

    }
    public boolean equals(Office Object){
        if(this.calcBuildingArea() == Object.calcBuildingArea() && this.getParkingSpaces() == Object.getParkingSpaces() )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
