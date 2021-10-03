package com.company;

import java.sql.SQLOutput;

public class Casting {
    public static void main(String[] args) {
        int a=257;
        byte b;
        double c=323.142;

        System.out.println("This is the conversion of int into byte");
        b=(byte) a;//Casting
        System.out.println("a and b "+ a +" "+b);
        System.out.println("This is the conversion of double into int ");
        a=(int) c;
        System.out.println("a and b "+ c +" "+a);
        System.out.println("This is the conversion of double into byte ");
        b=(byte) c;
        System.out.println("a and b "+ c +" "+b);
    }
}
