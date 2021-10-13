package com.company;

public class nested_loop {
    public static void main(String[] args) {
        int i,j;

        for(i=0;i<7;i++){
            for(j=i;j<7;j++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
