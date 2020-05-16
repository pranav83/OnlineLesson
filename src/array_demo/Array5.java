package array_demo;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int[]number = {10,-3,18,5,25};

        Arrays.sort(number);

        for (int i = 0; i < 5; i++) {

            System.out.print(" "+number[i]);
        }

        System.out.println();

        for (int i = 4; i >=0; i--) {

            System.out.print(" "+number[i]);
            
        }
        System.out.println();
        String[]names = {"Jay","Nath","Ani","Binoy","Champ"};
        Arrays.sort(names);

        for (int i = 0; i <5; i++) {
            System.out.print(names[i]+" ");
        }
        System.out.println();

        for (int i = 4; i >=0 ; i--) {
            System.out.print(names[i]+" ");
        }
    }
}
