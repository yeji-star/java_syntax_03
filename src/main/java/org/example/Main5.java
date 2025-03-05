package org.example;

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.

class Main5 {
    public static void main(String[] args) {
        int dan = 8;
        int i = 1;


        if (1001 > i) {
            i += 1;
            System.out.println(dan + " * " + i + " = " + dan * i );

            i++;
            System.out.println(dan + " * " + i + " = " + dan * i );


        } else {
            System.out.println("end");
        }
        // 출력
    /*

    System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1; // i 의 값을 1 증가 시킨다.
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1; // i 의 값을 1 증가 시킨다.(단축표현)
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++; // i 의 값을 1 증가 시킨다.(단축표현)
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;

    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    ...
    8 * 1000
    */
    }
}