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
        void qran(int s){                                       //Метод для верхней и нижней грани
        int sh=s*2+2;
        for (int i=0; i<sh; i++)
        {
            if (i==0 || i==sh-1)
                mOut.print('+');
            else mOut.print('-');
        }
        mOut.print('\n');
    }
    void verh(int ot_centra, int a, int b, int s)               //Метод для верней части ромба
    {
        for(int i=0;i<ot_centra;i++)
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
    void niz(int ot_centra, int a, int b, int s)                       //Метод для нижней части ромба
    {
        for(int i=0;i<ot_centra;i++)
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
    void centr_liniya(int s)                                    //Метод для центральной линии
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
    void centr(int s){                                      //Метод для всего заключенного между двумя гранями
        int ot_centra=s-1;                                  //Вызывается три метода
        if (ot_centra!=0)
        {
            int a = ot_centra;
            int b =0;
            verh(ot_centra,a,b,s);
            centr_liniya(s);
            niz(ot_centra,b,a,s);
        }
        else mOut.println("|<>|");
    }
    public void process(int size) {
        qran(size);
        centr(size);
        qran(size);
        }
        // TODO -- add your code here

    }
