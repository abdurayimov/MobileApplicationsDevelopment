package com.company.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool = false;

    public House(int length, int width, int lotLength, int lotWidth){
       super(length,width, lotLength,lotWidth);
       mOwner = null;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner){
        super(length,width, lotLength,lotWidth);
        mOwner = owner;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner,boolean pool){
        super(length,width, lotLength,lotWidth);
        mOwner = owner;
        mPool = pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public boolean hasPool(){if (mPool == true){return true;}else{return false;}}

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }
    @Override
    public String toString(){
        String flag = "Owner: " + mOwner;
        if (hasPool())
        {
            flag = flag + "; has a pool";
        }
       if(calcBuildingArea() < calcLotArea()){
           flag = flag + "; has a big open space";
       }
     return flag;
    }
    public boolean equals(House Object){
        if(this.calcBuildingArea() == Object.calcBuildingArea() && this.hasPool() == Object.hasPool())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
