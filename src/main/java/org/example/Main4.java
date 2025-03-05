package org.example;

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.

class Main4 {
    public static void main(String[] args) {
        int dan = 8;

        // 수정가능지역 시작
        int i = 1;

        for(i=1;i<10; i++)
            System.out.println(dan + " * " + i + " = " + dan * i);

        System.out.println("===");

        i = 1;

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
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);

        System.out.println("=====");

        i = 1;

        System.out.println(dan + " * " + i + " = " + dan * i);
        System.out.println(dan + " * " + ( i + i )+ " = " + dan * ( i + i ));
        System.out.println(dan + " * " + ( i + i + i )+ " = " + dan * ( i + i + i ));
        System.out.println(dan + " * " + ( i + i + i + i )+ " = " + dan * ( i + i + i + i ));
        System.out.println(dan + " * " + ( i + i + i + i + i )+ " = " + dan * ( i + i + i + i + i ));
        System.out.println(dan + " * " + ( i + i + i + i + i + i )+ " = " + dan * ( i + i + i + i + i + i ));
        System.out.println(dan + " * " + ( i + i + i + i + i + i + i )+ " = " + dan * ( i + i + i + i + i + i + i ));
        System.out.println(dan + " * " + ( i + i + i + i + i + i + i + i )+ " = " + dan * ( i + i + i + i + i + i + i + i ));
        System.out.println(dan + " * " + ( i + i + i + i + i + i + i + i + i )+ " = " + dan * ( i + i + i + i + i + i + i + i + i ));
        // 수정가능지역 끝

        // 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    */
    }
}