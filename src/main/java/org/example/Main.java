package org.example;



class Main {
    public static void main(String[] args) {

        //아래의 코드를 따라친 다음
        //결과가 왜 이렇게 나오는가? 를 서술(순차적으로. 한국어로)

        int rows = 4; // 이 부분을 바꿔보세요

        /* 변수 rows에 숫자를 넣기 (이 같은 경우 4) */

        for (int i = 1; i <= rows; i++) {
            /*          1     4    1   */
            /* 변수 i의 초기값은 1
               변수 i가 rows 보다 작거나 같을 때 i의 수는 증가 */

            for(int k = 1; k <= i; k++) {
                /*         1    1  1 */

                /* 변수 k의 초기값은 1
               변수 k가 i보다 작거나 같을 때 k의 수는 증가 */

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("다중 while문으로 풀어쓰기");

        rows = 7;
        int i = 1;

        while (i <= rows) {
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;

        }


    }
}