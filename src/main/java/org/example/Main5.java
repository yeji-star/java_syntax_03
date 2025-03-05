package org.example;

// 문제 : 1부터 5까지의 합을 출력해주세요.


class Main5 {
    public static void main(String[] args) {

        int i = 0;
        int j = 1;

        /*i += j;
        j++;
        i += j;
        j++;
        i += j;
        j++;
        i += j;
        j++;
        i += j;
         */


        while (j <= 5) {
            i += j;
            System.out.println(i);
            j++;
        }

        System.out.println("====");

        // 한번에 더한 것

        System.out.println(i);

    }
}
