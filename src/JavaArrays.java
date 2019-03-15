package org.javatutorials.arrays;


public class JavaArrays {
    //what is syntax
    public static void main(String args[]) {
        String[] names = new String[5];
        //["new york"]["chicago"]["airplane"]["earth"]["1234"]
        //array elements
        names[0]= "sky";
        names[1] = "earth";
        names[2] = "Pluto";
        names[3] = "1234";
        names[4] = "computer";

        names[3] = "Queens";
//treverse through

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for(int i = (names.length - 1 ); i >=0; i-- ) {
            System.out.println(names[i]);
        }

        Stirng name = "New York City";
        System.out.println(name.length());

        //exception
        //circumvant


        int [][]numbers = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };


        for(int i = 0; i < numbers.length; i++ ) {
            for (int j = 0; j < numbers[0].length; j++ ) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}