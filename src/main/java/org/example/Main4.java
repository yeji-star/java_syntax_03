package org.example;

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.

class Main4 {
    public static void main(String[] args) {
        int dan = 8;

        int i = 1;

        // 출력

        i = i * 1000;

        while (i >= -500) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i--;
        }

        System.out.println("for문");

        for(i=1;i>=-500;i--) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

    /*
    8 * 1000 = 8000
    ...
    8 * -500 = -4000
    */
    }
}