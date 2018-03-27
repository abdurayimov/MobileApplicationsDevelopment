package com.company.diamonds.logic;

import com.company.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
        implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    void gran(int s){                                       //Для верхней и нижней грани
        int sh=s*2+2;
        for (int i=0; i<sh; i++)
        {
            if (i==0 || i==sh-1)
                mOut.print('+');
            else mOut.print('-');
        }
        mOut.print('\n');
    }
    void verh(int centr, int a, int b, int s)               //Для верней части ромба
    {
        for(int i=0;i<centr;i++)
        {
            mOut.print('|');
            for(int k=0;k<a;k++) mOut.print(' ');
            mOut.print('/');
            if(b!=0)
            {
                for(int j=0;j<b;j++)
                {
                    if(b%2!=0)
                    {
                        mOut.print('-');
                        mOut.print('-');
                    }
                    else
                    {
                        mOut.print('=');
                        mOut.print('=');
                    }
                }
            }
            mOut.print((char)92);
            for(int k=0;k<a;k++) mOut.print(' ');
            mOut.print('|');
            mOut.print('\n');
            b++;
            a--;
        }
    }
    void niz(int centr, int a, int b, int s)                       //Для нижней части ромба
    {
        for(int i=0;i<centr;i++)
        {
            mOut.print('|');
            for(int k=0;k<a+1;k++) mOut.print(' ');
            mOut.print((char)92);
            if(b!=0)
            {
                for(int j=0;j<b-1;j++)
                {
                    if(b%2==0)
                    {
                        mOut.print('-');
                        mOut.print('-');
                    }
                    else
                    {
                        mOut.print('=');
                        mOut.print('=');
                    }
                }
            }
            mOut.print('/');
            for(int k=0;k<a+1;k++) mOut.print(' ');
            mOut.print('|');
            mOut.print('\n');
            a++;
            b--;
        }
    }
    void centr_l(int s)                                    //Для центральной линии
    {
        mOut.print('|');
        mOut.print('<');
        for(int h=0; h<s*2-2; h++)
        {
            if(s%2==0) mOut.print('-');
            else mOut.print('=');
        }
        mOut.println(">|");
    }
    void centr(int s){                                      //Для всего между двумя гранями
        int centr=s-1;
        if (centr!=0)
        {
            int a = centr;
            int b =0;
            verh(centr,a,b,s);
            centr_l(s);
            niz(centr,b,a,s);
        }
        else mOut.println("|<>|");
    }
    public void process(int size) {
        gran(size);
        centr(size);
        gran(size);
    }
    // TODO -- add your code here

}