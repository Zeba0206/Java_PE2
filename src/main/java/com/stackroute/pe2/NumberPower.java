package com.stackroute.pe2;



public class NumberPower
{
    public boolean power4(int num)
    {
        while(num!=1)
        {
            if(num%4==0)
            {
                num=num/4;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public boolean negativeInput(int num)
    {
        if(num<0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean zeroInput(int num)
    {
        if(num==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}