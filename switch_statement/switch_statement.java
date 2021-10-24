package com.company;

public class switch_statement {
    public static void main(String[] args) {
        int i;
        for(i=0;i<6;i++)
            switch(i){
                case 0:
                    System.out.println("i is in zero");
                    break;
                case 1:
                    System.out.println("i is in one");
                    break;
                case 2:
                    System.out.println("i is in two");
                    break;
                case 3:
                    System.out.println("i is in three");
                    break;

                default:
                    System.out.println("i is greater than 3");
            }
    }
}

