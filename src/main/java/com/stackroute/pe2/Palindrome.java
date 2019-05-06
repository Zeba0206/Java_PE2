/*Write a Java method to Reverse the given input & Check if it is a Palindrome.*/

package com.stackroute.pe2;

public class Palindrome {

    String rev = "";

    public String reverseStr(String name) {

        isPalindrome(name);



        int length = name.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        return rev;

    }


    public boolean isPalindrome(String name) {

        if (name == rev) {
            return true;
        } else {
            return false;
        }
    }


}