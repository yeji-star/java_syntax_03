package org.example;

// 고쳐...

class Main4 {
    public static void main(String[] args) {

        int n = 3;
        int i = 1;

        while (i <= n) {
            int j = i;
            while (j < n) {
                int k = 1;
                System.out.print(" ");
                while (k <= ( 2 * i - 1)) {
                    System.out.print("*");
                    k++;
                }
                System.out.println(" ");
                j++;
            }
            i++;
        }

        System.out.println("=====");

        for(i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for(i = n - 1; i >= 1; i--) {
            for(int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    /*
    8 * 1000 = 8000
    ...
    8 * -500 = -4000
    */
    }
}