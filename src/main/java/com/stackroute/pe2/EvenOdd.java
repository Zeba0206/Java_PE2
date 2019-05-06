package com.stackroute.pe2;

public class EvenOdd {

        public static boolean isEven(int number)
        {
            if (number % 2 == 0)
            {
                return true;
            }
            else {

                return false;
            }

        }


        public boolean testIsInteger()
        {
            char strp = 'C';
            boolean input = false;
            Boolean op = Character.isDigit(strp);
            if (op == true) {
                return true;
            } else {
                return false;
            }


        }

    }