package com.company.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN  = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;
    public Gate(){mSwing=CLOSED;}
    public boolean setSwing( int direction)
    {

        if(direction < -1 || direction > 1)
        {
            return false;
        }
        else
        {
            mSwing = direction;
            return true;
        }
    }
    public boolean open( int direction)
    {
        if(direction == IN || direction == OUT) {//Почему не сработало с direction != IN || direction != OUT
            setSwing(direction);
            return true;
        }
        else
        {
            return false;
        }

    }
    public int thru(int count)
    {

        if(getSwingDirection() == IN){return count;}
        else if(getSwingDirection() == OUT){return -count;}
        else return 0;
    }

    public int getSwingDirection()
    {
        return mSwing;
    }


    public String toString()
    {
        String message;
        if(getSwingDirection() == CLOSED){message="This gate is closed";}
        else if (getSwingDirection()==IN){message="This gate is open and swings to enter the pen only";}
        else if (getSwingDirection()==OUT){message = "This gate is open and swings to exit the pen only";}
        else {message="This gate has an invalid swing direction";}
        return message;
    }

    public boolean close()
    {
        if(mSwing==IN||mSwing==OUT)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
