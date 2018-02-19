package com.davidj.java;

/**
 * Created by David on 7/24/17.
 */
public class Bottles {
public static void main (String[] args) {

    String verse1 = " bottles of beer on the wall, ";
    String verse2 = " bottles of beer. ";
    String verse3 = "Take one down, pass it around, ";
    String verse4 = " bottles of beer on the wall. ";
    int x = 99;

    while (x > 1) {
        System.out.println(x + verse1 + x + verse2 + verse3 + (x - 1) + verse4);
        x = x - 1;
    }

    if (x == 1) {
        System.out.println(x + " bottle of beer on the wall, " + x + " bottle of beer.  " + "Take it down, pass it around, " + (x - 1) + " bottles of beer on the wall.");
        }
        
    }
}