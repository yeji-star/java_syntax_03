package org.example;

// 이걸 분석해봐야함...

class Main2 {
    public static void main(String[] args) {
        // 출력

        int n = 3;

        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}