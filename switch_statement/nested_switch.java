package com.company;

public class nested_switch {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i is in zero");
                    break;
                case 1:
                     for (j = 0; j < 3; j++)

                        switch(j){
                            case 1:
                               System.out.println("i is in one.one");
                            break;
                            case 2:
                               System.out.println("i is in two.two");
                            break;
                    }
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
