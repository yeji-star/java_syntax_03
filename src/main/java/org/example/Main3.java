package org.example;

// 문제 : 구구단 8단을 출력해주세요. 1000부터 1까지 곱해주세요.


class Main3 {
    public static void main(String[] args) {

        int dan = 8;
        int i;

        i = 1000;

        while (i > 1) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i--;
        }


    }
}