package org.example;

// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용

public class Main7 {
    public static void main(String[] args) {
        /* (1,2,3) * j
         */
        // 출력

        int i = 1;

        while (i <= 10) {

            int k = 1;

            System.out.println("i = " + i);

            while (k <= 3) {

                System.out.println(k);

                k++;
            }

            i++;

        }

        System.out.println("====");

        for (i=1;i<=10;i++) {
            for(int j=1;j<=3;j++) {
                System.out.println(j);
            }
        }

        System.out.println("====");





    }


}



        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3

